package com.gahlot.fragments101.BottomSheet;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gahlot.fragments101.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ActionBottomDialogFragment extends BottomSheetDialogFragment implements View.OnClickListener{

    public static final String TAG = "ActionBottomDialogFragment";

    private ItemClickListener itemClickListener;

    public static ActionBottomDialogFragment newInstance() {
        return new ActionBottomDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_sheet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.textView).setOnClickListener(this);
        view.findViewById(R.id.textView2).setOnClickListener(this);
        view.findViewById(R.id.textView3).setOnClickListener(this);
        view.findViewById(R.id.textView4).setOnClickListener(this);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ItemClickListener ) {
            itemClickListener = (ItemClickListener) context;
        } else {
            throw new RuntimeException(context.toString() + "must implement ItemClickListner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        itemClickListener = null;
    }
    @Override public void onClick(View view) {
        TextView tvSelected = (TextView) view;
        itemClickListener.onItemClick(tvSelected.getText().toString());
        dismiss();
    }


    public interface ItemClickListener {
        void onItemClick(String item);
    }

}
