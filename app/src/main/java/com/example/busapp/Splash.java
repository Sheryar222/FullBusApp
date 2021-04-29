package com.example.busapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;

    ImageView image;
    TextView txt;
    Animation topanim, Botoomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        Botoomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));


        image=(ImageView)findViewById(R.id.imageView);
        txt=(TextView)findViewById(R.id.textView);

        image.setAnimation(topanim);
        txt.setAnimation(Botoomanim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(Splash.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}