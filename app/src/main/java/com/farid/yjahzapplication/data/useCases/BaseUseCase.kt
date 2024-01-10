package com.farid.yjahzapplication.data.useCases

import com.farid.yjahzapplication.data.remote.DataRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.UnknownHostException
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.cancellation.CancellationException


typealias CompletionBlock<T> = BaseUseCase.Request<T>.() -> Unit
abstract class BaseUseCase<T>(protected var dataRepository: DataRepository) {

    private var parentJob: Job = Job()
    var backgroundContext: CoroutineContext = Dispatchers.IO
    var foregroundContext: CoroutineContext = Dispatchers.Main

    protected abstract suspend fun executeOnBackground(map: MutableMap<String, Any> , headerMap: Map<String , Any> ?= null): T

    fun execute(block: CompletionBlock<T>, map: MutableMap<String, Any> , headerMap: Map<String, Any>?= null) {
        val response = Request<T>().apply { block() }
        parentJob = Job()
        CoroutineScope(foregroundContext + parentJob).launch {
            try {
                val result = withContext(backgroundContext) {
                    executeOnBackground(map , headerMap)
                }
                response(result)

            } catch (unknownException: UnknownHostException) {
                response(unknownException)
            } catch (cancellationException: CancellationException) {
                response(cancellationException)
            } catch (e: Exception) {
                response(e)
            }
        }
    }

    protected suspend fun <X> runAsync(
        context: CoroutineContext = backgroundContext,
        block: suspend () -> X
    ): Deferred<X> {
        return CoroutineScope(context + parentJob).async {
            block.invoke()
        }
    }

    fun unsubscribe() {
        parentJob.apply {
            cancelChildren()
            cancel()
        }
    }

    class Request<T> {
        private var onComplete: ((T) -> Unit)? = null
        private var onError: ((Throwable) -> Unit)? = null
        private var onCancel: ((CancellationException) -> Unit)? = null


        fun onComplete(block: (T) -> Unit) {
            onComplete = block
        }

        fun onError(block: (Throwable) -> Unit) {
            onError = block
        }

        fun onCancel(block: (CancellationException) -> Unit) {
            onCancel = block
        }

        operator fun invoke(result: T) {
            onComplete?.invoke(result)
        }

        operator fun invoke(error: Throwable) {
            onError?.invoke(error)
        }

        operator fun invoke(error: CancellationException) {
            onCancel?.invoke(error)
        }

    }
}