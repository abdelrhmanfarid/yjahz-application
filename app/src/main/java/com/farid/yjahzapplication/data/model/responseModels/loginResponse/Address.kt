package com.farid.yjahzapplication.data.model.responseModels.loginResponse

import com.google.gson.JsonElement

data class Address(
    val id: Long,
    val lat: String,
    val lng: String,
    val address: JsonElement? = null,
    val street: String,
    val building: String,
    val apartment: String,
    val floor: JsonElement? = null,
    val name: JsonElement? = null
)
