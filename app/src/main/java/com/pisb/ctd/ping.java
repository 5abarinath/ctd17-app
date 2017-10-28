package com.pisb.ctd;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ping extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.ping,container,false);

        TextView ping = (TextView) myView.findViewById(R.id.pingIssuesLink);
        ping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent driveLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/folderview?id=0B7xgORAS7QdbMVF1RmRWcjNOVkk"));
                startActivity(driveLink);
            }
        });

        return myView;
    }
}
