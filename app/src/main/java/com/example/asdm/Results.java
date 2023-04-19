package com.example.asdm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Results#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Results extends Fragment {

    TextView txt;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         v = inflater.inflate(R.layout.fragment_results, container, false);
        return v;

    }

    public void showData(String data){
        txt = v.findViewById(R.id.resultview);
        txt.setText(data);
    }
}
