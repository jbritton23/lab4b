package com.example.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DistanceConverter extends Fragment {

    private EditText kiloMeters, miles;
    private TextView Miles, Kilometers;
    private Button convert;



    public DistanceConverter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //EditTexts
        kiloMeters = getActivity().findViewById(R.id.kiloMeters);
        miles = getActivity().findViewById(R.id.miles);

        //TextViews
        Miles = getActivity().findViewById(R.id.milesDisplay);
        Kilometers = getActivity().findViewById(R.id.kilometers);

        //Buttons
        convert = getActivity().findViewById(R.id.convert);



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_distance_converter, container, false);
    }
    public void onClick (View v){

        if (miles.getText().length() == 0) {
            double km = Double.parseDouble(kiloMeters.getText().toString());
            double mi = (km * .62);
            Miles.setText(String.valueOf(mi));
        }


        if (kiloMeters.getText().length() == 0){
            double mi = Double.parseDouble(miles.getText().toString());
            double km = mi/.62;
            Kilometers.setText(String.valueOf(km));
        }
        if (kiloMeters.getText().length() != 0 && miles.getText().length() != 0){
            Double mi = Double.parseDouble(miles.getText().toString());
            double km = mi/.62;
            Kilometers.setText(String.valueOf(km));
        }
        if (kiloMeters.getText().length()==0 && miles.getText().length()==0){

        }


    }

}


