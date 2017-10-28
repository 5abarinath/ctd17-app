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

public class fragment_ieeeInfo extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.frament_ieeeinfo,container,false);


        ImageButton btnBack = (ImageButton) myView.findViewById(R.id.button_back);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_pisbInfo())
                        .commit();
            }
        });


        return myView;
    }
}
