// Generated by view binder compiler. Do not edit!
package com.farid.yjahzapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.farid.yjahzapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PopularNowRecyclerItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout categoryContainer;

  @NonNull
  public final ImageView favoriteIcon;

  @NonNull
  public final ImageView itemImageView;

  @NonNull
  public final TextView itemName;

  private PopularNowRecyclerItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout categoryContainer, @NonNull ImageView favoriteIcon,
      @NonNull ImageView itemImageView, @NonNull TextView itemName) {
    this.rootView = rootView;
    this.categoryContainer = categoryContainer;
    this.favoriteIcon = favoriteIcon;
    this.itemImageView = itemImageView;
    this.itemName = itemName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PopularNowRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopularNowRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popular_now_recycler_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopularNowRecyclerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout categoryContainer = (ConstraintLayout) rootView;

      id = R.id.favorite_icon;
      ImageView favoriteIcon = ViewBindings.findChildViewById(rootView, id);
      if (favoriteIcon == null) {
        break missingId;
      }

      id = R.id.item_image_view;
      ImageView itemImageView = ViewBindings.findChildViewById(rootView, id);
      if (itemImageView == null) {
        break missingId;
      }

      id = R.id.item_name;
      TextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      return new PopularNowRecyclerItemBinding((ConstraintLayout) rootView, categoryContainer,
          favoriteIcon, itemImageView, itemName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
