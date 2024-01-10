package com.farid.yjahzapplication.data.useCases.homeUseCases.popularSelles_UseCase

import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse
import com.farid.yjahzapplication.data.remote.DataRepository
import com.farid.yjahzapplication.data.useCases.BaseUseCase
import javax.inject.Inject

class PopularSellersUseCase @Inject constructor(dataRepository: DataRepository) : BaseUseCase<PopularSellersResponse>(dataRepository) {

    override suspend fun executeOnBackground(map: MutableMap<String, Any>, headerMap: Map<String , Any>?): PopularSellersResponse {
        return dataRepository.getPopularSellers(   )
    }

}