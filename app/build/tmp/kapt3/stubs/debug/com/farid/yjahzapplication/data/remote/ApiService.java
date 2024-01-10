package com.farid.yjahzapplication.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/farid/yjahzapplication/data/remote/ApiService;", "", "getHomeBaseCategories", "Lcom/farid/yjahzapplication/data/model/responseModels/home/homeBaseResponse/HomeBaseCategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularSellers", "Lcom/farid/yjahzapplication/data/model/responseModels/home/popularSellersResponse/PopularSellersResponse;", "getTrendingSellers", "Lcom/farid/yjahzapplication/data/model/responseModels/home/trendingSellersResponse/TrendingSellersResponse;", "loginUser", "Lcom/farid/yjahzapplication/data/model/responseModels/loginResponse/Data;", "requestModel", "Lcom/farid/yjahzapplication/data/model/requestModels/loginRequest/LoginRequest;", "(Lcom/farid/yjahzapplication/data/model/requestModels/loginRequest/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/farid/yjahzapplication/data/model/responseModels/signUpResponse/SignUpResponse;", "Lcom/farid/yjahzapplication/data/model/requestModels/registerRequest/RegisterRequest;", "(Lcom/farid/yjahzapplication/data/model/requestModels/registerRequest/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.POST(value = "login")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loginUser(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.model.requestModels.loginRequest.LoginRequest requestModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data> $completion);
    
    @retrofit2.http.POST(value = "client-register")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerUser(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.model.requestModels.registerRequest.RegisterRequest requestModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse> $completion);
    
    @retrofit2.http.GET(value = "home-base-categories")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getHomeBaseCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse> $completion);
    
    @retrofit2.http.GET(value = "popular-sellers")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPopularSellers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse> $completion);
    
    @retrofit2.http.GET(value = "trending-sellers")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTrendingSellers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse> $completion);
}