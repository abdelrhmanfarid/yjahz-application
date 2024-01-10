package com.farid.yjahzapplication.ui.navigation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/home/HomeViewModel;", "Lcom/farid/yjahzapplication/base/BaseViewModel;", "mainRepository", "Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;", "homeBaseCategoriesUseCase", "Lcom/farid/yjahzapplication/data/useCases/homeUseCases/homeBaseUseCase/HomeBaseCategoriesUseCase;", "popularSellersUseCase", "Lcom/farid/yjahzapplication/data/useCases/homeUseCases/popularSelles_UseCase/PopularSellersUseCase;", "trendingUseCase", "Lcom/farid/yjahzapplication/data/useCases/homeUseCases/homeTrendingUseCase/HomeTrendingSellersUseCase;", "(Lcom/farid/yjahzapplication/data/local/LocalRepositoryImplementation;Lcom/farid/yjahzapplication/data/useCases/homeUseCases/homeBaseUseCase/HomeBaseCategoriesUseCase;Lcom/farid/yjahzapplication/data/useCases/homeUseCases/popularSelles_UseCase/PopularSellersUseCase;Lcom/farid/yjahzapplication/data/useCases/homeUseCases/homeTrendingUseCase/HomeTrendingSellersUseCase;)V", "_homeBaseCategoriesLiveDate", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "Lcom/farid/yjahzapplication/data/model/responseModels/home/homeBaseResponse/HomeBaseCategoriesResponse;", "_homePopularSellersLiveData", "Lcom/farid/yjahzapplication/data/model/responseModels/home/popularSellersResponse/PopularSellersResponse;", "_homeTrendingSellersLiveData", "Lcom/farid/yjahzapplication/data/model/responseModels/home/trendingSellersResponse/TrendingSellersResponse;", "homeBaseCategoriesLiveDate", "Lkotlinx/coroutines/flow/StateFlow;", "getHomeBaseCategoriesLiveDate", "()Lkotlinx/coroutines/flow/StateFlow;", "homePopularSellersLiveData", "getHomePopularSellersLiveData", "homeTrendingSellersLiveData", "getHomeTrendingSellersLiveData", "getHomeBaseCategories", "", "getPopularSellers", "getTrendingSellers", "start", "stop", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends com.farid.yjahzapplication.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.local.LocalRepositoryImplementation mainRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.useCases.homeUseCases.homeBaseUseCase.HomeBaseCategoriesUseCase homeBaseCategoriesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.useCases.homeUseCases.popularSelles_UseCase.PopularSellersUseCase popularSellersUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.farid.yjahzapplication.data.useCases.homeUseCases.homeTrendingUseCase.HomeTrendingSellersUseCase trendingUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse>> _homeBaseCategoriesLiveDate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse>> _homePopularSellersLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse>> _homeTrendingSellersLiveData = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.local.LocalRepositoryImplementation mainRepository, @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.useCases.homeUseCases.homeBaseUseCase.HomeBaseCategoriesUseCase homeBaseCategoriesUseCase, @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.useCases.homeUseCases.popularSelles_UseCase.PopularSellersUseCase popularSellersUseCase, @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.data.useCases.homeUseCases.homeTrendingUseCase.HomeTrendingSellersUseCase trendingUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.HomeBaseCategoriesResponse>> getHomeBaseCategoriesLiveDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.PopularSellersResponse>> getHomePopularSellersLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.farid.yjahzapplication.utils.LiveDataResource<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.TrendingSellersResponse>> getHomeTrendingSellersLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void stop() {
    }
    
    @java.lang.Override
    public void start() {
    }
    
    public final void getHomeBaseCategories() {
    }
    
    public final void getPopularSellers() {
    }
    
    public final void getTrendingSellers() {
    }
}