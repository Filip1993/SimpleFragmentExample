package com.filipkesteli.simplefragmentexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private Button btnFragment;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false); //kao setContentView
        //sad na View v mogu iskoristiti findViewById

        initWidgets(v); //moram se zakaciti na v
        setupListeners();
        return v;
    }

    private void initWidgets(View v) {
        //daj mi View koji se inflate-ao i izvuci mi id od Buttona btnFragment
        btnFragment = (Button) v.findViewById(R.id.btnFragment);
    }

    private void setupListeners() {
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.f_b_c2, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*public void fragmentClick(View view) {
        Toast.makeText(getActivity(), R.string.f_b_c, Toast.LENGTH_SHORT).show();
    }*/
}
