package com.example.ballontripuday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class StatusFragment extends Fragment {
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //laview.setAnimation(R.raw.lottiefile);
        //laview.playAnimation();
        //laview.loop(true);
        return inflater.inflate(R.layout.fragment_status, container, false);
        // Inflate the layout for this fragment
        //  button = findViewById(R.id.open_video);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(getApplicationContext() ,VideoViewHere.class);
//                startActivity(i);
//
//            }
//        },2000);
    }
}