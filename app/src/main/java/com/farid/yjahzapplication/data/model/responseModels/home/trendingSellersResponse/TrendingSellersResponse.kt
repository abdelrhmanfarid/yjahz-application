package com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse

data class TrendingSellersResponse(
    val `data`: Data,
    val message: String,
    val response_code: Int,
    val success: Boolean
)