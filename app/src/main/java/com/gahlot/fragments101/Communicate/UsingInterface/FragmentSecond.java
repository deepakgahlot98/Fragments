package com.gahlot.fragments101.Communicate.UsingInterface;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gahlot.fragments101.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_second, container, false);
        textView = view.findViewById(R.id.text);
        return view;
    }

    // This is a public method that the Activity can use to communicate
    // directly with this Fragment
    public void setNewText(String message) {
        textView.setText(message);
    }

}
