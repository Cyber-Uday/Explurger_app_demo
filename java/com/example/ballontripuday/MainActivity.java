package com.example.ballontripuday;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView laview;
    Animation sun2anim;
    ImageView sun2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sun2anim = AnimationUtils.loadAnimation(this, R.anim.sun2_anim);
        sun2 = findViewById(R.id.sun2);

        //laview.setAnimation(R.raw.lottiefile);
        //laview.playAnimation();
        //laview.loop(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                sun2.startAnimation(sun2anim);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, UdayProcess.class));
                        finish();

                    }
                }, 1000);

            }
        }, 2000);
    }
}






