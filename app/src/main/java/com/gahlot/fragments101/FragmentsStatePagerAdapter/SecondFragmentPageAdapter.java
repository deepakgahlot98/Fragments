package com.gahlot.fragments101.FragmentsStatePagerAdapter;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gahlot.fragments101.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragmentPageAdapter extends Fragment {


    public SecondFragmentPageAdapter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_fragment_page_adapter, container, false);
    }

}
