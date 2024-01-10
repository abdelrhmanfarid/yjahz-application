package com.farid.yjahzapplication.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;", "Lcom/farid/yjahzapplication/data/local/LocalRepository;", "prefManager", "Lcom/farid/yjahzapplication/data/local/prefrences/PreferencesManager;", "(Lcom/farid/yjahzapplication/data/local/prefrences/PreferencesManager;)V", "returnUserToken", "", "saveUserToken", "", "token", "app_debug"})
public final class LocalRepositoryImplementation implements com.farid.yjahzapplication.data.local.LocalRepository {
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.local.prefrences.PreferencesManager prefManager = null;
    
    @javax.inject.Inject
    public LocalRepositoryImplementation(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.local.prefrences.PreferencesManager prefManager) {
        super();
    }
    
    @java.lang.Override
    public void saveUserToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String returnUserToken() {
        return null;
    }
}