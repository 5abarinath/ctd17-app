package com.pisb.ctd;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class homeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //RelativeLayout rl = (RelativeLayout) findViewById(R.id.mainLayout);

        ImageView img1 = (ImageView) findViewById(R.id.imageView2);
        DisplayMetrics displaymetrics1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics1);
        int width1 = displaymetrics1.widthPixels;
        img1.setTranslationX(-width1/2);
        img1.animate().translationX((float)(2/3)*width1)
                .setDuration(800)
                .setStartDelay(300);

        ImageView img2 = (ImageView) findViewById(R.id.imageView3);
        DisplayMetrics displaymetrics2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics2);
        int width2 = displaymetrics2.widthPixels;
        img2.setTranslationX((float)1.5*width2);
        img2.animate().translationX((float)(2/3)*width2)
                .setDuration(800)
                .setStartDelay(210);

        ImageView img3 = (ImageView) findViewById(R.id.imageView4);
        DisplayMetrics displaymetrics3 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics3);
        int height1 = displaymetrics3.heightPixels;
        img3.setTranslationY((float)(-1.5*height1));
        img3.animate().translationY(0)
                .setDuration(900)
                .setStartDelay(1200);

        ImageView img4 = (ImageView) findViewById(R.id.imageView5);
        Animation fadein = new AlphaAnimation(0,1);
        fadein.setInterpolator(new AccelerateInterpolator());
        fadein.setStartOffset(2200);
        fadein.setDuration(600);
        img4.setAnimation(fadein);


        new CountDownTimer(3200,3200) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        }.start();



    }
}
