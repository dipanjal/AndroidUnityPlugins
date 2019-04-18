package com.tutorial.vibratorapp;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.VibrationEffect;
import android.os.Vibrator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VibratorUnity extends AppCompatActivity {


    public static void longVibration(){
        new VibratorUnity().vibrate(500);
    }
    public static void midVibration(){
        new VibratorUnity().vibrate(150);
    }
    public static void shortVibration(){
        new VibratorUnity().vibrate(50);
    }



    private void vibrate(long mili){

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            VibrationEffect vibrationEffect = VibrationEffect.createOneShot(mili, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.vibrate(vibrationEffect);
        }else{
            vibrator.vibrate(mili);
        }
    }
}
