package com.pisb.ctd;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sabari on 27/1/17.
 */

public class fragment_eventXodia extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_event_tabbed_xodi,container,false);

        TextView crap = (TextView) myView.findViewById(R.id.textview_nthinfo);
        crap.setText(R.string.info_xodia);

        return myView;
    }
}
