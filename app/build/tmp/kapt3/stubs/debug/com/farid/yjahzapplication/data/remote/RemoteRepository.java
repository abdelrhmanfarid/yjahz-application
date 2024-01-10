package com.farid.yjahzapplication.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J%\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/farid/yjahzapplication/data/remote/RemoteRepository;", "", "getHomeBaseCategories", "Lcom/farid/yjahzapplication/data/model/responseModels/home/homeBaseResponse/HomeBaseCategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularSellers", "Lcom/farid/yjahzapplication/data/model/responseModels/home/popularSellersResponse/PopularSellersResponse;", "getTrendingSellers", "Lcom/farid/yjahzapplication/data/model/responseModels/home/trendingSellersResponse/TrendingSellersResponse;", "loginUser", "Lcom/farid/yjahzapplication/data/model/responseModels/loginResponse/Data;", "map", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/farid/yjahzapplication/data/model/responseModels/signUpResponse/SignUpResponse;", "app_debug"})
public abstract interface RemoteRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> map, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> map, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getHomeBaseCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPopularSellers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTrendingSellers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse> $completion);
}