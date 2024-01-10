package com.farid.yjahzapplication.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/farid/yjahzapplication/data/remote/DataRepository;", "Lcom/farid/yjahzapplication/data/remote/RemoteRepository;", "apiService", "Lcom/farid/yjahzapplication/data/remote/ApiService;", "(Lcom/farid/yjahzapplication/data/remote/ApiService;)V", "getHomeBaseCategories", "Lcom/farid/yjahzapplication/data/model/responseModels/home/homeBaseResponse/HomeBaseCategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularSellers", "Lcom/farid/yjahzapplication/data/model/responseModels/home/popularSellersResponse/PopularSellersResponse;", "getTrendingSellers", "Lcom/farid/yjahzapplication/data/model/responseModels/home/trendingSellersResponse/TrendingSellersResponse;", "loginUser", "Lcom/farid/yjahzapplication/data/model/responseModels/loginResponse/Data;", "map", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/farid/yjahzapplication/data/model/responseModels/signUpResponse/SignUpResponse;", "app_debug"})
public final class DataRepository implements com.farid.yjahzapplication.data.remote.RemoteRepository {
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.remote.ApiService apiService = null;
    
    @javax.inject.Inject
    public DataRepository(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.remote.ApiService apiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> map, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> map, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getHomeBaseCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getPopularSellers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getTrendingSellers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse> $completion) {
        return null;
    }
}