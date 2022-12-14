// Generated by view binder compiler. Do not edit!
package edu.farmingdale.alrajab.bcs421.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import edu.farmingdale.alrajab.bcs421.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDatabaseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText etfirstNamedb;

  @NonNull
  public final EditText etlastNamedb;

  @NonNull
  public final Button readData;

  @NonNull
  public final TextView tvuserName;

  @NonNull
  public final Button updateButtonn;

  @NonNull
  public final Button writeData;

  @NonNull
  public final Group writeGroup;

  private ActivityDatabaseBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText etfirstNamedb, @NonNull EditText etlastNamedb, @NonNull Button readData,
      @NonNull TextView tvuserName, @NonNull Button updateButtonn, @NonNull Button writeData,
      @NonNull Group writeGroup) {
    this.rootView = rootView;
    this.etfirstNamedb = etfirstNamedb;
    this.etlastNamedb = etlastNamedb;
    this.readData = readData;
    this.tvuserName = tvuserName;
    this.updateButtonn = updateButtonn;
    this.writeData = writeData;
    this.writeGroup = writeGroup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDatabaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDatabaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_database, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDatabaseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etfirstNamedb;
      EditText etfirstNamedb = ViewBindings.findChildViewById(rootView, id);
      if (etfirstNamedb == null) {
        break missingId;
      }

      id = R.id.etlastNamedb;
      EditText etlastNamedb = ViewBindings.findChildViewById(rootView, id);
      if (etlastNamedb == null) {
        break missingId;
      }

      id = R.id.read_data;
      Button readData = ViewBindings.findChildViewById(rootView, id);
      if (readData == null) {
        break missingId;
      }

      id = R.id.tvuserName;
      TextView tvuserName = ViewBindings.findChildViewById(rootView, id);
      if (tvuserName == null) {
        break missingId;
      }

      id = R.id.updateButtonn;
      Button updateButtonn = ViewBindings.findChildViewById(rootView, id);
      if (updateButtonn == null) {
        break missingId;
      }

      id = R.id.write_data;
      Button writeData = ViewBindings.findChildViewById(rootView, id);
      if (writeData == null) {
        break missingId;
      }

      id = R.id.writeGroup;
      Group writeGroup = ViewBindings.findChildViewById(rootView, id);
      if (writeGroup == null) {
        break missingId;
      }

      return new ActivityDatabaseBinding((ConstraintLayout) rootView, etfirstNamedb, etlastNamedb,
          readData, tvuserName, updateButtonn, writeData, writeGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
