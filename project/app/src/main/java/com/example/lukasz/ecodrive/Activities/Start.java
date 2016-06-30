package com.example.lukasz.ecodrive.Activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import com.example.lukasz.ecodrive.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Lukasz on 2016-06-28.
 */
public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
    }

    @Override
    public void onStart() {
        super.onStart();
        new CountDownTimer(3000, 1000) {
            public void onFinish() {

                next();
            }
            public void onTick(long millisUntilFinished) {
            }
        }.start();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    private void next(){
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
        finish();
    }

}
