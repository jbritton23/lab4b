package com.example.lab4b;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipCalculator extends Fragment {

    private EditText bill, tip, guests;
    private TextView total;
    private Button calculate;

    public TipCalculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bill = (EditText)getActivity().findViewById(R.id.bill);
        tip = (EditText)getActivity().findViewById(R.id.tipPercent);
        guests = (EditText)getActivity().findViewById(R.id.Guests);

        total = (TextView)getActivity().findViewById(R.id.total);

        calculate = (Button)getActivity().findViewById(R.id.Calculate);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tip_calculator, container, false);



    }




    public void onClick(View v){


        float b = Float.parseFloat(bill.getText().toString());
        float t = Float.parseFloat(tip.getText().toString());
        float g = Float.parseFloat(guests.getText().toString());

        float prod = (b*t+b)/g;
        DecimalFormat df = new DecimalFormat("$#0.##");

        total.setText(String.valueOf(df.format(prod)));
    }

}


