package com.gahlot.fragments101.Communicate.UsingViewModel;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gahlot.fragments101.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentConvertedCurrency extends Fragment {


    public FragmentConvertedCurrency() {
        // Required empty public constructor
    }

    private MyViewModel model;
    private TextView txtName;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise ViewModel here
        model = ViewModelProviders.of(requireActivity()).get(MyViewModel.class);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_converted_currency, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        model.getName().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                float canadianCurrency = (float) (Integer.valueOf(s) / 53.27);

                txtName.setText("$ -> " + canadianCurrency);
            }
        });
    }

}
