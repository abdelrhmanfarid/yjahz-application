package com.farid.yjahzapplication.ui.navigation.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/login/LoginViewModel;", "Lcom/farid/yjahzapplication/base/BaseViewModel;", "loginUseCase", "Lcom/farid/yjahzapplication/data/useCases/loginUseCase/LoginUseCase;", "mainRepository", "Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;", "(Lcom/farid/yjahzapplication/data/useCases/loginUseCase/LoginUseCase;Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;)V", "_loginLiveData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "Lcom/farid/yjahzapplication/data/model/responseModels/loginResponse/Data;", "loginLiveData", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginLiveData", "()Lkotlinx/coroutines/flow/StateFlow;", "loginConsumer", "", "email", "", "password", "start", "stop", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends com.farid.yjahzapplication.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.useCases.loginUseCase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.local.LocalRepositoryImplementation mainRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data>> _loginLiveData = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.useCases.loginUseCase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.local.LocalRepositoryImplementation mainRepository) {
        super();
    }
    
    @java.lang.Override
    public void stop() {
    }
    
    @java.lang.Override
    public void start() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data>> getLoginLiveData() {
        return null;
    }
    
    public final void loginConsumer(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}