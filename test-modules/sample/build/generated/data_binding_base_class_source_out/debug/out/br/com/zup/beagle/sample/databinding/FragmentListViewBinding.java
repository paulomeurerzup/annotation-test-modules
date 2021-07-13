// Generated by view binder compiler. Do not edit!
package br.com.zup.beagle.sample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import br.com.zup.beagle.sample.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentListViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btDeprecatedList;

  @NonNull
  public final Button btLocalList;

  @NonNull
  public final Button btNestedImageList;

  @NonNull
  public final Button btNestedList;

  private FragmentListViewBinding(@NonNull LinearLayout rootView, @NonNull Button btDeprecatedList,
      @NonNull Button btLocalList, @NonNull Button btNestedImageList,
      @NonNull Button btNestedList) {
    this.rootView = rootView;
    this.btDeprecatedList = btDeprecatedList;
    this.btLocalList = btLocalList;
    this.btNestedImageList = btNestedImageList;
    this.btNestedList = btNestedList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentListViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_list_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentListViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btDeprecatedList;
      Button btDeprecatedList = rootView.findViewById(id);
      if (btDeprecatedList == null) {
        break missingId;
      }

      id = R.id.btLocalList;
      Button btLocalList = rootView.findViewById(id);
      if (btLocalList == null) {
        break missingId;
      }

      id = R.id.btNestedImageList;
      Button btNestedImageList = rootView.findViewById(id);
      if (btNestedImageList == null) {
        break missingId;
      }

      id = R.id.btNestedList;
      Button btNestedList = rootView.findViewById(id);
      if (btNestedList == null) {
        break missingId;
      }

      return new FragmentListViewBinding((LinearLayout) rootView, btDeprecatedList, btLocalList,
          btNestedImageList, btNestedList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
