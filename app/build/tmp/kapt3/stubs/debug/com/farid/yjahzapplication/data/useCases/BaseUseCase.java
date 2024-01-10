package com.farid.yjahzapplication.data.useCases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001)B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J[\u0010\u0014\u001a\u00020\u00152\'\u0010\u0016\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u00150\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u0019\u00a2\u0006\u0002\b\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fJ=\u0010 \u001a\u00028\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!JE\u0010\"\u001a\b\u0012\u0004\u0012\u0002H$0#\"\u0004\b\u0001\u0010$2\b\b\u0002\u0010%\u001a\u00020\u00072\u001c\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H$0&\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/farid/yjahzapplication/data/useCases/BaseUseCase;", "T", "", "dataRepository", "Lcom/farid/yjahzapplication/data/remote/DataRepository;", "(Lcom/farid/yjahzapplication/data/remote/DataRepository;)V", "backgroundContext", "Lkotlin/coroutines/CoroutineContext;", "getBackgroundContext", "()Lkotlin/coroutines/CoroutineContext;", "setBackgroundContext", "(Lkotlin/coroutines/CoroutineContext;)V", "getDataRepository", "()Lcom/farid/yjahzapplication/data/remote/DataRepository;", "setDataRepository", "foregroundContext", "getForegroundContext", "setForegroundContext", "parentJob", "Lkotlinx/coroutines/Job;", "execute", "", "block", "Lkotlin/Function1;", "Lcom/farid/yjahzapplication/data/useCases/BaseUseCase$Request;", "Lcom/farid/yjahzapplication/data/useCases/CompletionBlock;", "Lkotlin/ExtensionFunctionType;", "map", "", "", "headerMap", "", "executeOnBackground", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runAsync", "Lkotlinx/coroutines/Deferred;", "X", "context", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "Request", "app_debug"})
public abstract class BaseUseCase<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private com.farid.yjahzapplication.data.remote.DataRepository dataRepository;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.Job parentJob;
    @org.jetbrains.annotations.NotNull
    private kotlin.coroutines.CoroutineContext backgroundContext;
    @org.jetbrains.annotations.NotNull
    private kotlin.coroutines.CoroutineContext foregroundContext;
    
    public BaseUseCase(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.remote.DataRepository dataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.farid.yjahzapplication.data.remote.DataRepository getDataRepository() {
        return null;
    }
    
    protected final void setDataRepository(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.remote.DataRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext getBackgroundContext() {
        return null;
    }
    
    public final void setBackgroundContext(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext getForegroundContext() {
        return null;
    }
    
    public final void setForegroundContext(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected abstract java.lang.Object executeOnBackground(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> map, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, ? extends java.lang.Object> headerMap, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> $completion);
    
    public final void execute(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.farid.yjahzapplication.data.useCases.BaseUseCase.Request<T>, kotlin.Unit> block, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> map, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, ? extends java.lang.Object> headerMap) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <X extends java.lang.Object>java.lang.Object runAsync(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super X>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends X>> $completion) {
        return null;
    }
    
    public final void unsubscribe() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0086\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0086\u0002J\u0015\u0010\f\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007H\u0086\u0002J\u001e\u0010\u0004\u001a\u00020\b2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005J\u001a\u0010\t\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0005J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0005R \u0010\u0004\u001a\u0014\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/farid/yjahzapplication/data/useCases/BaseUseCase$Request;", "T", "", "()V", "onCancel", "Lkotlin/Function1;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "onComplete", "onError", "", "invoke", "result", "(Ljava/lang/Object;)V", "error", "block", "app_debug"})
    public static final class Request<T extends java.lang.Object> {
        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onComplete;
        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError;
        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function1<? super java.util.concurrent.CancellationException, kotlin.Unit> onCancel;
        
        public Request() {
            super();
        }
        
        public final void onComplete(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        }
        
        public final void onError(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> block) {
        }
        
        public final void onCancel(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.util.concurrent.CancellationException, kotlin.Unit> block) {
        }
        
        public final void invoke(T result) {
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        java.lang.Throwable error) {
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull
        java.util.concurrent.CancellationException error) {
        }
    }
}