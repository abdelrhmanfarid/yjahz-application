package com.farid.yjahzapplication.data.useCases.homeUseCases.homeBaseUseCase

import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse
import com.farid.yjahzapplication.data.remote.DataRepository
import com.farid.yjahzapplication.data.useCases.BaseUseCase
import javax.inject.Inject

class HomeBaseCategoriesUseCase @Inject constructor(dataRepository: DataRepository) : BaseUseCase<HomeBaseCategoriesResponse>(dataRepository) {

    override suspend fun executeOnBackground(map: MutableMap<String, Any>, headerMap: Map<String , Any>?): HomeBaseCategoriesResponse {
        return dataRepository.getHomeBaseCategories( )
    }

}