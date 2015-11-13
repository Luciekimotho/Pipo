package com.lucie.pipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Intro extends AppCompatActivity {
    private static int SPLASH_TIME = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Intro.this, Home.class);
                startActivity(i);

            }
        }, SPLASH_TIME);

    }
        void startAnim(){
            findViewById(R.id.avloadingIndicatorView).setVisibility(View.VISIBLE);
        }


         void stopAnim(){
             findViewById(R.id.avloadingIndicatorView).setVisibility(View.GONE);
         }


    }
