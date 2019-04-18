package com.tutorial.vibratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void doVibrate(View view){
        int id = view.getId();

        if (id == R.id.button_1){
            VibratorUnity.longVibration();
        }
        if (id == R.id.button_2){
            VibratorUnity.midVibration();
        }
        if (id == R.id.button3){
            VibratorUnity.shortVibration();
        }
    }



}
