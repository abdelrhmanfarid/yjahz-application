package com.farid.yjahzapplication.ui.navigation.home.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001aH\u0016J\u001c\u0010$\u001a\u00020 2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/home/adapter/CategoriesRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/farid/yjahzapplication/ui/navigation/home/adapter/CategoriesRecyclerAdapter$ViewHolder;", "myList", "", "Lcom/farid/yjahzapplication/data/model/responseModels/home/homeBaseResponse/DataX;", "(Ljava/util/List;)V", "categoriesArrayList", "getCategoriesArrayList", "()Ljava/util/List;", "setCategoriesArrayList", "categoriesArrayListFull", "categoriesRecyclerClickListener", "Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/CategoriesRecyclerClickListener;", "getCategoriesRecyclerClickListener", "()Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/CategoriesRecyclerClickListener;", "setCategoriesRecyclerClickListener", "(Lcom/farid/yjahzapplication/ui/navigation/home/clickEvents/CategoriesRecyclerClickListener;)V", "isArabicLanguage", "", "()Z", "setArabicLanguage", "(Z)V", "parent", "Landroid/view/ViewGroup;", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "submitMyList", "ViewHolder", "app_debug"})
public final class CategoriesRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.farid.yjahzapplication.ui.navigation.home.adapter.CategoriesRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> myList;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> categoriesArrayList;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> categoriesArrayListFull = null;
    private boolean isArabicLanguage = false;
    @org.jetbrains.annotations.Nullable
    private android.view.ViewGroup parent;
    @org.jetbrains.annotations.Nullable
    private com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener categoriesRecyclerClickListener;
    
    public CategoriesRecyclerAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> myList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> getCategoriesArrayList() {
        return null;
    }
    
    public final void setCategoriesArrayList(@org.jetbrains.annotations.NotNull
    java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> p0) {
    }
    
    public final boolean isArabicLanguage() {
        return false;
    }
    
    public final void setArabicLanguage(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener getCategoriesRecyclerClickListener() {
        return null;
    }
    
    public final void setCategoriesRecyclerClickListener(@org.jetbrains.annotations.Nullable
    com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener p0) {
    }
    
    public final void submitMyList(@org.jetbrains.annotations.NotNull
    java.util.List<com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX> myList, @org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener categoriesRecyclerClickListener) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.farid.yjahzapplication.ui.navigation.home.adapter.CategoriesRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.farid.yjahzapplication.ui.navigation.home.adapter.CategoriesRecyclerAdapter.ViewHolder holder, int position) {
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
    
    public CategoriesRecyclerAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/farid/yjahzapplication/ui/navigation/home/adapter/CategoriesRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/farid/yjahzapplication/databinding/HomeCategoriesRecyclerItemBinding;", "(Lcom/farid/yjahzapplication/ui/navigation/home/adapter/CategoriesRecyclerAdapter;Lcom/farid/yjahzapplication/databinding/HomeCategoriesRecyclerItemBinding;)V", "getBinding", "()Lcom/farid/yjahzapplication/databinding/HomeCategoriesRecyclerItemBinding;", "setBinding", "(Lcom/farid/yjahzapplication/databinding/HomeCategoriesRecyclerItemBinding;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.farid.yjahzapplication.databinding.HomeCategoriesRecyclerItemBinding binding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.farid.yjahzapplication.databinding.HomeCategoriesRecyclerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.farid.yjahzapplication.databinding.HomeCategoriesRecyclerItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull
        com.farid.yjahzapplication.databinding.HomeCategoriesRecyclerItemBinding p0) {
        }
    }
}