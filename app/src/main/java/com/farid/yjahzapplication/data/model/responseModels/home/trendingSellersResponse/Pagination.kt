package com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse

data class Pagination(
    val count: Int,
    val current_page: Int,
    val is_pagination: Boolean,
    val per_page: Int,
    val total: Int,
    val total_pages: Int
)