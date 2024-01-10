package com.farid.yjahzapplication.data.useCases.registerUseCase

import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse
import com.farid.yjahzapplication.data.remote.DataRepository
import com.farid.yjahzapplication.data.useCases.BaseUseCase
import javax.inject.Inject

class RegisterUseCase @Inject constructor(dataRepository: DataRepository) :
    BaseUseCase<SignUpResponse>(dataRepository) {

    override suspend fun executeOnBackground(map: MutableMap<String, Any>, headerMap: Map<String, Any>?): SignUpResponse {
        return dataRepository.registerUser(map)
    }

}