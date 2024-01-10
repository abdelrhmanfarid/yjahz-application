package com.farid.yjahzapplication.ui.navigation.signUp

import com.farid.yjahzapplication.base.BaseViewModel
import com.farid.yjahzapplication.data.local.LocalRepositoryImplementation
import com.farid.yjahzapplication.data.model.requestModels.registerRequest.RegisterRequest
import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse
import com.farid.yjahzapplication.data.remote.MyRequestMap
import com.farid.yjahzapplication.data.useCases.registerUseCase.RegisterUseCase
import com.farid.yjahzapplication.utils.LiveDataResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val registerUseCase: RegisterUseCase,
    private val mainRepository: LocalRepositoryImplementation
) : BaseViewModel() {
    override fun stop() {
        registerUseCase.unsubscribe()
    }

    override fun start() {

    }

    private val _signUpLiveData: MutableStateFlow<LiveDataResource<SignUpResponse>> = MutableStateFlow(
        LiveDataResource.EmptyState()
    )
    val signUpLiveData: StateFlow<LiveDataResource<SignUpResponse>> get() = _signUpLiveData



    fun signUpUser(name: String, email: String, password: String, phone: String) {
        _signUpLiveData.value = LiveDataResource.Loading()
        params[MyRequestMap.REGISTER_USER] =
            RegisterRequest(name = name, email = email, password = password, phone = phone)
        registerUseCase.execute({
            onComplete {
                if (it.success == true) {

                    _signUpLiveData.value = LiveDataResource.Success(it)
                    // save the user data
                    mainRepository.saveUserToken(it.data.token)

                } else {
                    _signUpLiveData.value = LiveDataResource.ErrorResponse(it)
//                            showErrorMessage(it)
                }
            }
            onError {

            }
            onCancel {
            }
        }, params)


    }




}