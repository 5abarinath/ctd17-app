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

public class fragment_ctdInfo extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.content_main,container,false);

        ImageButton btnForward = (ImageButton) myView.findViewById(R.id.button_forward);
        btnForward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_pisbInfo(), "home2")
                        .commit();
            }
        });


        return myView;
    }
}
