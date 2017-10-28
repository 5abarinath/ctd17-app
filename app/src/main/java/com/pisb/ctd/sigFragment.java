package com.pisb.ctd;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by sabari on 22/1/17.
 */

public class sigFragment extends Fragment {
    View myView;

    int count = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_sig,container,false);


        if(count == 0) {
            Toast.makeText(getActivity(), R.string.toast_sig, Toast.LENGTH_LONG).show();
            count++;
        }

        ImageButton button_sig_cc = (ImageButton) myView.findViewById(R.id.button_cc);
        button_sig_cc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new sigFragment_cc())
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageButton button_sig_hack = (ImageButton) myView.findViewById(R.id.button_hacking);
        button_sig_hack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new sigFragment_hack())
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageButton button_sig_web = (ImageButton) myView.findViewById(R.id.button_webdev);
        button_sig_web.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new sigFragment_web())
                        .addToBackStack(null)
                        .commit();
            }
        });


        return myView;
    }
}
