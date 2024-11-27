package com.example.ballontripuday;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class logo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo1);
        Handler a=new Handler();
        a.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(logo1.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
