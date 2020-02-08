package com.gahlot.fragments101.DynamicFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.gahlot.fragments101.R;


public class newFragment extends Fragment {

    ImageView animation;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_new, container, false);
        animation = view.findViewById(R.id.new_fragment_view);

        Glide.with(getContext()).load("https://media.giphy.com/media/3ohzAgQoDP5MJSGkrS/giphy.gif").error(R.drawable.ic_launcher_background)
                .into(animation);
        return view;
    }


}
