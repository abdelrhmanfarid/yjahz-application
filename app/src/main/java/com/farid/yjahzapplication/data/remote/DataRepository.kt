package com.farid.yjahzapplication.data.remote


import com.farid.yjahzapplication.data.model.requestModels.loginRequest.LoginRequest
import com.farid.yjahzapplication.data.model.requestModels.registerRequest.RegisterRequest
import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse
import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data
import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse

import com.farid.yjahzapplication.data.remote.MyRequestMap.LOGIN_USER
import com.farid.yjahzapplication.data.remote.MyRequestMap.REGISTER_USER
import javax.inject.Inject

class DataRepository @Inject constructor(private val apiService: ApiService) : RemoteRepository {

    override suspend fun loginUser(map: MutableMap<String, Any>): Data {
        return apiService.loginUser(map[LOGIN_USER]as LoginRequest)

    }

    override suspend fun registerUser(map: MutableMap<String, Any>): SignUpResponse {
        return apiService.registerUser(map[REGISTER_USER]as RegisterRequest)
    }

    override suspend fun getHomeBaseCategories(): HomeBaseCategoriesResponse {
        return apiService.getHomeBaseCategories()
    }


    override suspend fun getPopularSellers(): PopularSellersResponse {
        return apiService.getPopularSellers()
    }

    override suspend fun getTrendingSellers(): TrendingSellersResponse {
        return apiService.getTrendingSellers()
    }


}