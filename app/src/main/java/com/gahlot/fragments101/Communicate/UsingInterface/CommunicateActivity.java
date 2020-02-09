package com.gahlot.fragments101.Communicate.UsingInterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.gahlot.fragments101.R;

public class CommunicateActivity extends AppCompatActivity implements FragmentOne.OnFragmentOneListener {

    private static final String FIRST_TAG = "first";
    private static final String SECOND_TAG = "second";
    FragmentOne mFirstFragment;
    FragmentSecond mSecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicate);

        FragmentManager fragmentManager = getSupportFragmentManager();

        mFirstFragment = (FragmentOne) fragmentManager.findFragmentByTag(FIRST_TAG);
        if (mFirstFragment == null) {
            mFirstFragment = new FragmentOne();
            fragmentManager.beginTransaction().add(R.id.first_fragment_container_viewmodel, mFirstFragment, FIRST_TAG).commit();
        }

        mSecondFragment = (FragmentSecond) fragmentManager.findFragmentByTag(SECOND_TAG);
        if (mSecondFragment == null) {
            mSecondFragment = new FragmentSecond();
            fragmentManager.beginTransaction().add(R.id.second_fragment_container_viewmodel, mSecondFragment, FIRST_TAG).commit();
        }
    }

    @Override
    public void messageFromFragmentOne(String msg) {
        mSecondFragment.setNewText(msg);
    }
}
