package com.farid.yjahzapplication.data.useCases.loginUseCase


import com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data
import com.farid.yjahzapplication.data.remote.DataRepository
import com.farid.yjahzapplication.data.useCases.BaseUseCase
import javax.inject.Inject

class LoginUseCase @Inject constructor(dataRepository: DataRepository) :
    BaseUseCase<Data>(dataRepository) {

    override suspend fun executeOnBackground(map: MutableMap<String, Any>, headerMap: Map<String, Any>?): Data {
        return dataRepository.loginUser(map)
    }

}