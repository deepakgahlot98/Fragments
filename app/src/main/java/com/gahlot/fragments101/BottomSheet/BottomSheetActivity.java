package com.gahlot.fragments101.BottomSheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gahlot.fragments101.R;

public class BottomSheetActivity extends AppCompatActivity implements ActionBottomDialogFragment.ItemClickListener{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        textView = findViewById(R.id.tvSelectedItem);
    }

    public void showBottomSheet(View view) {
        ActionBottomDialogFragment addPhotoBottomDialogFragment = ActionBottomDialogFragment.newInstance();
        addPhotoBottomDialogFragment.show(getSupportFragmentManager(),ActionBottomDialogFragment.TAG);
    }

    @Override
    public void onItemClick(String item) {
        textView.setText("Selected action item: " + item);
    }
}
