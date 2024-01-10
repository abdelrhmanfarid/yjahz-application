package com.farid.yjahzapplication.ui.navigation.home;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\b\u0010\u001e\u001a\u00020\u0011H\u0014J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000fH\u0016J\u0012\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000fH\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010)\u001a\u00020\u0011H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/home/HomeFragment;", "Lcom/farid/yjahzapplication/base/BaseFragment;", "Lcom/farid/yjahzapplication/ui/navigation/home/HomeViewModel;", "Lcom/farid/yjahzapplication/databinding/FragmentHomeBinding;", "Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/CategoriesRecyclerClickListener;", "Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/PopularNowRecyclerItemClickListener;", "Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/TrendingNowRecyclerItemClickListener;", "()V", "categoriesRecyclerAdapter", "Lcom/farid/yjahzapplication/ui/navigation/home/adapter/CategoriesRecyclerAdapter;", "popularNowRecyclerAdapter", "Lcom/farid/yjahzapplication/ui/navigation/home/adapter/PopularNowRecyclerAdapter;", "trendingNowRecyclerAdapter", "Lcom/farid/yjahzapplication/ui/navigation/home/adapter/TrendingNowRecyclerAdapter;", "getContentView", "", "initCategoriesRecycler", "", "categoriesList", "", "Lcom/farid/yjahzapplication/data/model/responseModels/home/homeBaseResponse/DataX;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "initPopularNowRecycler", "popularList", "Lcom/farid/yjahzapplication/data/model/responseModels/home/popularSellersResponse/DataXX;", "initTrendingNowRecycler", "trendingNowList", "Lcom/farid/yjahzapplication/data/model/responseModels/home/trendingSellersResponse/DataX;", "initView", "initializeViewModel", "observeHomeBaseCategories", "observeHomePopularSellers", "observeHomeTrendingSellers", "onCategoryClickListener", "position", "onClick", "v", "Landroid/view/View;", "onPopularNowItemClickListener", "onTrendingNowRecyclerItemClickListener", "subscribeLiveData", "app_debug"})
public final class HomeFragment extends com.farid.yjahzapplication.base.BaseFragment<com.farid.yjahzapplication.ui.navigation.home.HomeViewModel, com.farid.yjahzapplication.databinding.FragmentHomeBinding> implements com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener, com.farid.yjahzapplication.ui.navigation.home.clickEvents.PopularNowRecyclerItemClickListener, com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener {
    @org.jetbrains.annotations.Nullable
    private com.farid.yjahzapplication.ui.navigation.home.adapter.CategoriesRecyclerAdapter categoriesRecyclerAdapter;
    @org.jetbrains.annotations.Nullable
    private com.farid.yjahzapplication.ui.navigation.home.adapter.PopularNowRecyclerAdapter popularNowRecyclerAdapter;
    @org.jetbrains.annotations.Nullable
    private com.farid.yjahzapplication.ui.navigation.home.adapter.TrendingNowRecyclerAdapter trendingNowRecyclerAdapter;
    
    public HomeFragment() {
        super();
    }
    
    @java.lang.Override
    protected int getContentView() {
        return 0;
    }
    
    @java.lang.Override
    protected void initializeViewModel() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
    }
    
    @java.lang.Override
    protected void initView() {
    }
    
    @java.lang.Override
    protected void subscribeLiveData() {
    }
    
    private final void observeHomeBaseCategories() {
    }
    
    private final void observeHomePopularSellers() {
    }
    
    private final void observeHomeTrendingSellers() {
    }
    
    private final void initCategoriesRecycler(java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> categoriesList, androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void initPopularNowRecycler(java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.DataXX> popularList, androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void initTrendingNowRecycler(java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> trendingNowList, androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override
    public void onCategoryClickListener(int position) {
    }
    
    @java.lang.Override
    public void onPopularNowItemClickListener(int position) {
    }
    
    @java.lang.Override
    public void onTrendingNowRecyclerItemClickListener(int position) {
    }
}