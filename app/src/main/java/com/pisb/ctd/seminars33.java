package com.pisb.ctd;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by sabari on 16/2/17.
 */

public class seminars33 extends Fragment {

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_layout_32,container,false);


        ImageButton btnForward = (ImageButton) myView.findViewById(R.id.button_forward);
        btnForward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new seminars4(), "fragment_seminars4")
                        .commit();
            }
        });

        ImageButton btnBack = (ImageButton) myView.findViewById(R.id.button_back);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new seminars3(), "fragment_seminars3")
                        .commit();
            }
        });
        return myView;
    }
}
