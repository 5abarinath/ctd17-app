package com.pisb.ctd;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by sabari on 8/2/17.
 */

public class fragment_pisbInfo extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_pisbinfo, container, false);

        ImageButton btnForward = (ImageButton) myView.findViewById(R.id.button_forward);
        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_ieeeInfo(), "home3")
                        .commit();
            }
        });

        ImageButton btnBack = (ImageButton) myView.findViewById(R.id.button_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_ctdInfo())
                        .commit();
            }
        });


        return myView;

    }
}
