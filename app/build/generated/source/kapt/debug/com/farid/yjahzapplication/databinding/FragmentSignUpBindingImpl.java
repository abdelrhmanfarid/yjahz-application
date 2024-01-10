package com.farid.yjahzapplication.databinding;
import com.farid.yjahzapplication.R;
import com.farid.yjahzapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignUpBindingImpl extends FragmentSignUpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backgroundImage, 1);
        sViewsWithIds.put(R.id.logo_imageview, 2);
        sViewsWithIds.put(R.id.constraintLayout, 3);
        sViewsWithIds.put(R.id.sign_up_cardView, 4);
        sViewsWithIds.put(R.id.name_tv, 5);
        sViewsWithIds.put(R.id.nameEditText, 6);
        sViewsWithIds.put(R.id.email_tv, 7);
        sViewsWithIds.put(R.id.email_edit_text, 8);
        sViewsWithIds.put(R.id.phone_number_tv, 9);
        sViewsWithIds.put(R.id.phone_number_edit_text, 10);
        sViewsWithIds.put(R.id.password_tv, 11);
        sViewsWithIds.put(R.id.password_edit_text, 12);
        sViewsWithIds.put(R.id.confirm_password_tv, 13);
        sViewsWithIds.put(R.id.confirm_password_edit_text, 14);
        sViewsWithIds.put(R.id.sign_up_button, 15);
        sViewsWithIds.put(R.id.have_an_account, 16);
        sViewsWithIds.put(R.id.login_tv, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.EditText) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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