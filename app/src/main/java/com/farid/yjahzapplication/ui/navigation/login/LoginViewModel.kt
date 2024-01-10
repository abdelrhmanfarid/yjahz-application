package com.farid.yjahzapplication.ui.navigation.login

import com.farid.yjahzapplication.base.BaseViewModel
import com.farid.yjahzapplication.data.local.LocalRepositoryImplementation
import com.farid.yjahzapplication.data.model.requestModels.loginRequest.LoginRequest
import com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data
import com.farid.yjahzapplication.data.remote.MyRequestMap.LOGIN_USER
import com.farid.yjahzapplication.data.useCases.loginUseCase.LoginUseCase
import com.farid.yjahzapplication.utils.LiveDataResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val mainRepository: LocalRepositoryImplementation
) : BaseViewModel() {

    override fun stop() {
        loginUseCase.unsubscribe()
    }

    override fun start() {
    }


    private val _loginLiveData: MutableStateFlow<LiveDataResource<Data>> = MutableStateFlow(LiveDataResource.EmptyState())
    val loginLiveData: StateFlow<LiveDataResource<Data>> get() = _loginLiveData



    fun loginConsumer(email:String,password:String ){

                _loginLiveData.value = LiveDataResource.Loading()
                params[LOGIN_USER] = LoginRequest(email = email, password = password)
                loginUseCase.execute({
                    onComplete {
                        if (it.success == true){

                            _loginLiveData.value = LiveDataResource.Success(it)

                        }else{
                            _loginLiveData.value = LiveDataResource.ErrorResponse(it)
                        }
                    }
                    onError {
                        if (networkStatus){
                            _loginLiveData.value = LiveDataResource.Exception()
                        }else{
                            _loginLiveData.value = LiveDataResource.NoNetwork()
                        }
                    }
                    onCancel {
                    }
                }, params)
//            }
        }
    }
