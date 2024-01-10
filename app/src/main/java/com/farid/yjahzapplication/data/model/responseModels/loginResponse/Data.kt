package com.farid.yjahzapplication.data.model.responseModels.loginResponse

import com.farid.yjahzapplication.data.model.responseModels.BaseResponseModel


data class Data (
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val image: String,
    val type: Long,
    val status: Long,
    val balance: String,
    val addresses: List<Address>,
    val token: String
): BaseResponseModel()