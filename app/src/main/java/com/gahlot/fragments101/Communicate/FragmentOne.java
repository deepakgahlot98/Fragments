package com.gahlot.fragments101.Communicate;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gahlot.fragments101.R;


public class FragmentOne extends Fragment {

    private OnFragmentOneListener mCallback;
    private Button button1,button2,button3;
    String message = "";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmentone, container, false);
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = "This was the first button pressed on the Top";
                mCallback.messageFromFragmentOne(message);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = "This was the middle button pressed on the Top";
                mCallback.messageFromFragmentOne(message);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = "This was the last button pressed on the Top";
                mCallback.messageFromFragmentOne(message);
            }
        });
        return view;
    }

    // This is the interface that the Activity will implement
    // so that this Fragment can communicate with the Activity.
    public interface OnFragmentOneListener {
        void messageFromFragmentOne(String msg);
    }


    // This method insures that the Activity has actually implemented our
    // listener and that it isn't null.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentOneListener) {
            mCallback = (OnFragmentOneListener) context;
        } else {
            throw new RuntimeException(context.toString() + "must implement OnGreenFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }
}
