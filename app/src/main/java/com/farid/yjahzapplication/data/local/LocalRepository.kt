package com.farid.yjahzapplication.data.local

import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse


interface LocalRepository {

    fun saveUserToken(token: String)

    fun returnUserToken(): String
}