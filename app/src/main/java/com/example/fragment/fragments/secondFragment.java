package com.example.fragment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class secondFragment extends Fragment implements View.OnClickListener{
    EditText etRadius;
    Button btnAreaOfCircle;

    public secondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        etRadius =view.findViewById(R.id.etRadius);
        btnAreaOfCircle = view.findViewById(R.id.btnAreaOfCircle);

        btnAreaOfCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius =float.parseFloat(etRadius.getText().toString());
        float area=3.14f * radius * radius;

        Toast.makeText(getActivity(), "area of cicrle", Toast.LENGTH_SHORT).show();
    }
}
