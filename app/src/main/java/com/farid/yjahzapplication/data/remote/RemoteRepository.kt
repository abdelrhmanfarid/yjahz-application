package com.farid.yjahzapplication.data.remote

import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse
import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data
import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse


interface RemoteRepository {

    suspend fun loginUser(map: MutableMap<String, Any>): Data

    suspend fun registerUser(map: MutableMap<String, Any>): SignUpResponse

    suspend fun getHomeBaseCategories(): HomeBaseCategoriesResponse

    suspend fun getPopularSellers(): PopularSellersResponse

    suspend fun getTrendingSellers(): TrendingSellersResponse

}