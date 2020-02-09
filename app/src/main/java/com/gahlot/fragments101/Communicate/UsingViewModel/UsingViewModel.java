package com.gahlot.fragments101.Communicate.UsingViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.gahlot.fragments101.Communicate.UsingInterface.FragmentOne;
import com.gahlot.fragments101.Communicate.UsingInterface.FragmentSecond;
import com.gahlot.fragments101.R;

public class UsingViewModel extends AppCompatActivity {

    private static final String FIRST_TAG = "input";
    private static final String SECOND_TAG = "output";
    FragmentCurrency inputCurrency;
    FragmentConvertedCurrency outputCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_view_model);

        FragmentManager fragmentManager = getSupportFragmentManager();

        inputCurrency = (FragmentCurrency) fragmentManager.findFragmentByTag(FIRST_TAG);
        if (inputCurrency == null) {
            inputCurrency = new FragmentCurrency();
            fragmentManager.beginTransaction().add(R.id.first_fragment_container, inputCurrency, FIRST_TAG).commit();
        }

        outputCurrency = (FragmentConvertedCurrency) fragmentManager.findFragmentByTag(SECOND_TAG);
        if (outputCurrency == null) {
            outputCurrency = new FragmentConvertedCurrency();
            fragmentManager.beginTransaction().add(R.id.second_fragment_container, outputCurrency, FIRST_TAG).commit();
        }
    }
}
