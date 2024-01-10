package com.farid.yjahzapplication.data.remote

import com.farid.yjahzapplication.data.model.requestModels.loginRequest.LoginRequest
import com.farid.yjahzapplication.data.model.requestModels.registerRequest.RegisterRequest
import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse
import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data
import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("login")
    suspend fun loginUser(@Body requestModel: LoginRequest): Data

    @POST("client-register")
    suspend fun registerUser(@Body requestModel: RegisterRequest): SignUpResponse

    @GET("home-base-categories")
    suspend fun getHomeBaseCategories(): HomeBaseCategoriesResponse

    @GET("popular-sellers")
    suspend fun getPopularSellers():PopularSellersResponse

    @GET("trending-sellers")
    suspend fun getTrendingSellers(): TrendingSellersResponse




}