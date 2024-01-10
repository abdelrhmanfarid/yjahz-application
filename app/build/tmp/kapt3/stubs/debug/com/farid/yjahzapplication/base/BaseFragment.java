package com.farid.yjahzapplication.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H$J\b\u0010\u0016\u001a\u00020\u0017H$J\b\u0010\u0018\u001a\u00020\u0017H$J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010%\u001a\u00020\u0017H$R\u001c\u0010\b\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/farid/yjahzapplication/base/BaseFragment;", "VM", "Lcom/farid/yjahzapplication/base/BaseViewModel;", "VB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "baseViewBinding", "getBaseViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setBaseViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "baseViewModel", "getBaseViewModel", "()Lcom/farid/yjahzapplication/base/BaseViewModel;", "setBaseViewModel", "(Lcom/farid/yjahzapplication/base/BaseViewModel;)V", "Lcom/farid/yjahzapplication/base/BaseViewModel;", "getContentView", "", "initView", "", "initializeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "subscribeLiveData", "app_debug"})
public abstract class BaseFragment<VM extends com.farid.yjahzapplication.base.BaseViewModel, VB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable
    private VM baseViewModel;
    public VB baseViewBinding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final VM getBaseViewModel() {
        return null;
    }
    
    protected final void setBaseViewModel(@org.jetbrains.annotations.Nullable
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final VB getBaseViewBinding() {
        return null;
    }
    
    public final void setBaseViewBinding(@org.jetbrains.annotations.NotNull
    VB p0) {
    }
    
    protected abstract int getContentView();
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void initializeViewModel();
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void initView();
    
    protected abstract void subscribeLiveData();
    
    @java.lang.Override
    public void onDestroy() {
    }
}