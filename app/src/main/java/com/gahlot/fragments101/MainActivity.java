package com.gahlot.fragments101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gahlot.fragments101.DynamicFragments.DynamicFragmentActivity;
import com.gahlot.fragments101.XmlFragments.FragmentImplemented;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button xmlfragment, dynamicFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        init();
    }

    private void init() {
        xmlfragment = findViewById(R.id.xmlFragment);
        dynamicFragment = findViewById(R.id.dynamicFragment);
    }

    @Override
    public void onClick(View view) {
        if (xmlfragment.equals(view)) {
            openFragmentImplemented();
        } else if (dynamicFragment.equals(view)) {
            openDynamicFragment();
        }
    }

    private void openFragmentImplemented() {
        Intent intent = new Intent(this, FragmentImplemented.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    private void openDynamicFragment() {
        Intent intent = new Intent(this, DynamicFragmentActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

}
