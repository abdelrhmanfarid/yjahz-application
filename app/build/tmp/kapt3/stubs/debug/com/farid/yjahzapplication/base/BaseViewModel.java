package com.farid.yjahzapplication.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001fH&J\b\u0010#\u001a\u00020\u001fH&R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/farid/yjahzapplication/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorDialog", "Landroidx/lifecycle/MutableLiveData;", "", "headerParams", "", "", "getHeaderParams", "()Ljava/util/Map;", "setHeaderParams", "(Ljava/util/Map;)V", "networkStatus", "", "getNetworkStatus", "()Z", "setNetworkStatus", "(Z)V", "params", "getParams", "setParams", "paramsGet", "getParamsGet", "setParamsGet", "partMap", "Lokhttp3/RequestBody;", "getPartMap", "setPartMap", "successDialog", "showSuccessMessage", "", "baseModel", "Lcom/farid/yjahzapplication/data/model/responseModels/BaseResponseModel;", "start", "stop", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorDialog;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> successDialog;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, java.lang.Object> params;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, java.lang.String> paramsGet;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, java.lang.Object> headerParams;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, okhttp3.RequestBody> partMap;
    private boolean networkStatus = false;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> getParams() {
        return null;
    }
    
    public final void setParams(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> getParamsGet() {
        return null;
    }
    
    public final void setParamsGet(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> getHeaderParams() {
        return null;
    }
    
    public final void setHeaderParams(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, okhttp3.RequestBody> getPartMap() {
        return null;
    }
    
    public final void setPartMap(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, okhttp3.RequestBody> p0) {
    }
    
    public abstract void stop();
    
    public abstract void start();
    
    public final boolean getNetworkStatus() {
        return false;
    }
    
    public final void setNetworkStatus(boolean p0) {
    }
    
    public final void showSuccessMessage(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.model.responseModels.BaseResponseModel baseModel) {
    }
}