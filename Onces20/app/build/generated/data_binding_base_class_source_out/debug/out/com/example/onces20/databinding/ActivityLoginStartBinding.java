// Generated by view binder compiler. Do not edit!
package com.example.onces20.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.onces20.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginStartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView2;

  private ActivityLoginStartBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4,
      @NonNull TextView textView15, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.button = button;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.textView15 = textView15;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginStartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_start, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginStartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityLoginStartBinding((ConstraintLayout) rootView, button, imageView2,
          imageView3, imageView4, textView15, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
