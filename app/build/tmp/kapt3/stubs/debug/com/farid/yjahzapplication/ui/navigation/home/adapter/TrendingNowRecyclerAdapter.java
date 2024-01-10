package com.farid.yjahzapplication.ui.navigation.home.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001aH\u0016J\u001c\u0010$\u001a\u00020 2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/home/adapter/TrendingNowRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/farid/yjahzapplication/ui/navigation/home/adapter/TrendingNowRecyclerAdapter$ViewHolder;", "myList", "", "Lcom/farid/yjahzapplication/data/model/responseModels/home/trendingSellersResponse/DataX;", "(Ljava/util/List;)V", "isArabicLanguage", "", "()Z", "setArabicLanguage", "(Z)V", "parent", "Landroid/view/ViewGroup;", "trendingNowArrayList", "getTrendingNowArrayList", "()Ljava/util/List;", "setTrendingNowArrayList", "trendingNowArrayListFull", "trendingNowRecyclerItemClickListener", "Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/TrendingNowRecyclerItemClickListener;", "getTrendingNowRecyclerItemClickListener", "()Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/TrendingNowRecyclerItemClickListener;", "setTrendingNowRecyclerItemClickListener", "(Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/TrendingNowRecyclerItemClickListener;)V", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "submitMyList", "ViewHolder", "app_debug"})
public final class TrendingNowRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.farid.yjahzapplication.ui.navigation.home.adapter.TrendingNowRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> myList;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> trendingNowArrayList;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> trendingNowArrayListFull = null;
    private boolean isArabicLanguage = false;
    @org.jetbrains.annotations.Nullable
    private android.view.ViewGroup parent;
    @org.jetbrains.annotations.Nullable
    private com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener trendingNowRecyclerItemClickListener;
    
    public TrendingNowRecyclerAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> myList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> getTrendingNowArrayList() {
        return null;
    }
    
    public final void setTrendingNowArrayList(@org.jetbrains.annotations.NotNull
    java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> p0) {
    }
    
    public final boolean isArabicLanguage() {
        return false;
    }
    
    public final void setArabicLanguage(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener getTrendingNowRecyclerItemClickListener() {
        return null;
    }
    
    public final void setTrendingNowRecyclerItemClickListener(@org.jetbrains.annotations.Nullable
    com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener p0) {
    }
    
    public final void submitMyList(@org.jetbrains.annotations.NotNull
    java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX> myList, @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener trendingNowRecyclerItemClickListener) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.farid.yjahzapplication.ui.navigation.home.adapter.TrendingNowRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.ui.navigation.home.adapter.TrendingNowRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public TrendingNowRecyclerAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/home/adapter/TrendingNowRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/farid/yjahzapplication/databinding/TrendingNowRecyclerItemBinding;", "(Lcom/farid/yjahzapplication/ui/navigation/home/adapter/TrendingNowRecyclerAdapter;Lcom/farid/yjahzapplication/databinding/TrendingNowRecyclerItemBinding;)V", "getBinding", "()Lcom/farid/yjahzapplication/databinding/TrendingNowRecyclerItemBinding;", "setBinding", "(Lcom/farid/yjahzapplication/databinding/TrendingNowRecyclerItemBinding;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.farid.yjahzapplication.databinding.TrendingNowRecyclerItemBinding binding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.farid.yjahzapplication.databinding.TrendingNowRecyclerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.farid.yjahzapplication.databinding.TrendingNowRecyclerItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull
        com.farid.yjahzapplication.databinding.TrendingNowRecyclerItemBinding p0) {
        }
    }
}