package com.farid.yjahzapplication.databinding;
import com.farid.yjahzapplication.R;
import com.farid.yjahzapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.home_header_container, 1);
        sViewsWithIds.put(R.id.back_image, 2);
        sViewsWithIds.put(R.id.textView, 3);
        sViewsWithIds.put(R.id.group_image_view, 4);
        sViewsWithIds.put(R.id.cart_image_view, 5);
        sViewsWithIds.put(R.id.user_name_text_view, 6);
        sViewsWithIds.put(R.id.location_text_view, 7);
        sViewsWithIds.put(R.id.location_image, 8);
        sViewsWithIds.put(R.id.search_edit_text, 9);
        sViewsWithIds.put(R.id.search_image_view, 10);
        sViewsWithIds.put(R.id.filter_image_view, 11);
        sViewsWithIds.put(R.id.categories_text_view, 12);
        sViewsWithIds.put(R.id.categories_view_all_text_view, 13);
        sViewsWithIds.put(R.id.categories_recycler_view, 14);
        sViewsWithIds.put(R.id.popular_now_text_view, 15);
        sViewsWithIds.put(R.id.popular_view_all_text_view, 16);
        sViewsWithIds.put(R.id.popular_now_recycler_view, 17);
        sViewsWithIds.put(R.id.Trending_now_text_view, 18);
        sViewsWithIds.put(R.id.trending_view_all_text_view, 19);
        sViewsWithIds.put(R.id.trending_now_recycler_view, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.EditText) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[6]
            );
        this.scrollView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}