package com.pisb.ctd;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by sabari on 22/1/17.
 */

public class contactUs extends Fragment {

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.contactus,container,false);

        ImageView button_fb = (ImageView) myView.findViewById(R.id.button_fb);
        button_fb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String url = "https://www.facebook.com/credenztechdayz17";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView button_twitter = (ImageView) myView.findViewById(R.id.button_twitter);
        button_twitter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String url = "https://www.twitter.com/credenztechdayz";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        return myView;
    }

}
