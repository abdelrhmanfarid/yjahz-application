package com.farid.yjahzapplication.data.useCases.homeUseCases.homeTrendingUseCase

import com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse
import com.farid.yjahzapplication.data.remote.DataRepository
import com.farid.yjahzapplication.data.useCases.BaseUseCase
import javax.inject.Inject

class HomeTrendingSellersUseCase @Inject constructor(dataRepository: DataRepository) :
    BaseUseCase<TrendingSellersResponse>(dataRepository) {

    override suspend fun executeOnBackground(
        map: MutableMap<String, Any>,
        headerMap: Map<String, Any>?
    ): TrendingSellersResponse {
        return dataRepository.getTrendingSellers()
    }

}