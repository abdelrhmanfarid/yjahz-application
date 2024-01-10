package com.farid.yjahzapplication.ui.navigation.home


import com.farid.yjahzapplication.base.BaseViewModel
import com.farid.yjahzapplication.data.local.LocalRepositoryImplementation
import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse
import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse
import com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse
import com.farid.yjahzapplication.data.useCases.homeUseCases.homeBaseUseCase.HomeBaseCategoriesUseCase
import com.farid.yjahzapplication.data.useCases.homeUseCases.homeTrendingUseCase.HomeTrendingSellersUseCase
import com.farid.yjahzapplication.data.useCases.homeUseCases.popularSelles_UseCase.PopularSellersUseCase
import com.farid.yjahzapplication.utils.LiveDataResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val mainRepository: LocalRepositoryImplementation,
    private val homeBaseCategoriesUseCase: HomeBaseCategoriesUseCase,
    private val popularSellersUseCase: PopularSellersUseCase,
    private val trendingUseCase: HomeTrendingSellersUseCase

) : BaseViewModel() {

    private val _homeBaseCategoriesLiveDate: MutableStateFlow<LiveDataResource<HomeBaseCategoriesResponse>> = MutableStateFlow(LiveDataResource.EmptyState())
    val homeBaseCategoriesLiveDate: StateFlow<LiveDataResource<HomeBaseCategoriesResponse>> get() = _homeBaseCategoriesLiveDate


    private val _homePopularSellersLiveData: MutableStateFlow<LiveDataResource<PopularSellersResponse>> = MutableStateFlow(LiveDataResource.EmptyState())
    val homePopularSellersLiveData: StateFlow<LiveDataResource<PopularSellersResponse>> get() = _homePopularSellersLiveData


    private val _homeTrendingSellersLiveData: MutableStateFlow<LiveDataResource<TrendingSellersResponse>> = MutableStateFlow(LiveDataResource.EmptyState())
    val homeTrendingSellersLiveData: StateFlow<LiveDataResource<TrendingSellersResponse>> get() = _homeTrendingSellersLiveData


    override fun stop() {
        homeBaseCategoriesUseCase.unsubscribe()
        popularSellersUseCase.unsubscribe()
        trendingUseCase.unsubscribe()
    }

    override fun start() {

    }


    fun getHomeBaseCategories(){
        _homeBaseCategoriesLiveDate.value = (LiveDataResource.Loading())
        homeBaseCategoriesUseCase.execute({
            onComplete {
                _homeBaseCategoriesLiveDate.value = (LiveDataResource.Success(it))

            }
            onError {

                if (networkStatus){
                    _homeBaseCategoriesLiveDate.value = (LiveDataResource.Exception())
                }else{
                    _homeBaseCategoriesLiveDate.value = (LiveDataResource.NoNetwork())
                }
            }
            onCancel {
                _homeBaseCategoriesLiveDate.value = (LiveDataResource.EmptyState())
            }
        }, params )
    }

    fun getPopularSellers(){
        _homePopularSellersLiveData.value = (LiveDataResource.Loading())
        popularSellersUseCase.execute({
            onComplete {
                _homePopularSellersLiveData.value =( LiveDataResource.Success(it))
            }
            onError {
                _homePopularSellersLiveData.value = (LiveDataResource.ErrorResponse())
            }
            onCancel {
                _homePopularSellersLiveData.value = (LiveDataResource.EmptyState())
            }
        },params)
    }


    fun getTrendingSellers(){
        _homeTrendingSellersLiveData.value = (LiveDataResource.Loading())
        trendingUseCase.execute({
            onComplete {

                _homeTrendingSellersLiveData.value =( LiveDataResource.Success(it))
            }
            onError {
                _homeTrendingSellersLiveData.value = (LiveDataResource.ErrorResponse())
            }
            onCancel {
                _homeTrendingSellersLiveData.value = (LiveDataResource.EmptyState())
            }
        },params)
    }


}