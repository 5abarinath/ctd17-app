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

public class events extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.events, container, false);

        ImageButton button_ncc = (ImageButton) myView.findViewById(R.id.nccBtn);
        button_ncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventNcc())
                        .addToBackStack(null)
                        .commit();
            }
        });


        ImageButton button_nth = (ImageButton) myView.findViewById(R.id.nthBtn);
        button_nth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventNth())
                        .addToBackStack(null)
                        .commit();
            }
        });


        ImageButton button_quiz = (ImageButton) myView.findViewById(R.id.quizBtn);
        button_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventQuiz())
                        .addToBackStack(null)
                        .commit();
            }
        });


        ImageButton button_xodia = (ImageButton) myView.findViewById(R.id.xodiaBtn);
        button_xodia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventXodia())
                        .addToBackStack(null)
                        .commit();
            }
        });


        ImageButton button_enigma = (ImageButton) myView.findViewById(R.id.enigmaBtn);
        button_enigma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventEnigma())
                        .addToBackStack(null)
                        .commit();
            }
        });


        ImageButton button_unravel = (ImageButton) myView.findViewById(R.id.unravelBtn);
        button_unravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventUnravel())
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageButton button_wall = (ImageButton) myView.findViewById(R.id.wallstreetBtn);
        button_wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_eventWallstreet())
                        .addToBackStack(null)
                        .commit();
            }
        });


        return myView;
    }
}