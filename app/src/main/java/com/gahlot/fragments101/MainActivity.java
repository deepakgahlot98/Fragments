package com.gahlot.fragments101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gahlot.fragments101.Communicate.UsingInterface.CommunicateActivity;
import com.gahlot.fragments101.Communicate.UsingViewModel.UsingViewModel;
import com.gahlot.fragments101.DynamicFragments.DynamicFragmentActivity;
import com.gahlot.fragments101.FragmentsStatePagerAdapter.FragmentPagerActivity;
import com.gahlot.fragments101.ViewPager.ViewPagerActivity;
import com.gahlot.fragments101.XmlFragments.FragmentImplemented;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button xmlfragment, dynamicFragment, communicationFragment, viewmodelCommunciation, viewPagerButton,
            fragmentstatepagerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        init();
    }

    private void init() {
        xmlfragment = findViewById(R.id.xmlFragment);
        dynamicFragment = findViewById(R.id.dynamicFragment);
        communicationFragment = findViewById(R.id.communicationFragment);
        viewmodelCommunciation = findViewById(R.id.viewmodelCommunication);
        viewPagerButton = findViewById(R.id.viewpagerbutton);
        fragmentstatepagerbutton = findViewById(R.id.fragmentstatepager);

    }

    @Override
    public void onClick(View view) {
        if (xmlfragment.equals(view)) {
            openFragmentImplemented();
        } else if (dynamicFragment.equals(view)) {
            openDynamicFragment();
        } else if (communicationFragment.equals(view)) {
            openCommunicationFragment();
        } else if (viewmodelCommunciation.equals(view)) {
            openViewModelCommunicationFragment();
        } else if (viewPagerButton.equals(view)) {
            openViewPagerActivity();
        } else if (fragmentstatepagerbutton.equals(view)) {
            openFragmentStatePagerActivity();
        }
    }

    private void openFragmentStatePagerActivity() {
        Intent intent = new Intent(this, FragmentPagerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    private void openViewPagerActivity() {
        Intent intent = new Intent(this, ViewPagerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    private void openViewModelCommunicationFragment() {
        Intent intent = new Intent(this, UsingViewModel.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
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

    private void openCommunicationFragment() {
        Intent intent = new Intent(this, CommunicateActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

}
