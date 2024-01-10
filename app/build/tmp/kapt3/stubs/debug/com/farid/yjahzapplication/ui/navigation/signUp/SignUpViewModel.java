package com.farid.yjahzapplication.ui.navigation.signUp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/signUp/SignUpViewModel;", "Lcom/farid/yjahzapplication/base/BaseViewModel;", "registerUseCase", "Lcom/farid/yjahzapplication/data/useCases/registerUseCase/RegisterUseCase;", "mainRepository", "Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;", "(Lcom/farid/yjahzapplication/data/useCases/registerUseCase/RegisterUseCase;Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;)V", "_signUpLiveData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "Lcom/farid/yjahzapplication/data/model/responseModels/signUpResponse/SignUpResponse;", "signUpLiveData", "Lkotlinx/coroutines/flow/StateFlow;", "getSignUpLiveData", "()Lkotlinx/coroutines/flow/StateFlow;", "signUpUser", "", "name", "", "email", "password", "phone", "start", "stop", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignUpViewModel extends com.farid.yjahzapplication.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.useCases.registerUseCase.RegisterUseCase registerUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.local.LocalRepositoryImplementation mainRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse>> _signUpLiveData = null;
    
    @javax.inject.Inject
    public SignUpViewModel(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.useCases.registerUseCase.RegisterUseCase registerUseCase, @org.jetbrains.annotations.NotNull
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
    public final kotlinx.coroutines.flow.StateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse>> getSignUpLiveData() {
        return null;
    }
    
    public final void signUpUser(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String phone) {
    }
}