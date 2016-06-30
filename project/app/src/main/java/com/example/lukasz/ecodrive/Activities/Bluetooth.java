package com.example.lukasz.ecodrive.Activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.lukasz.ecodrive.R;


/**
 * Created by Lukasz on 2016-06-29.
 */
public class Bluetooth extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetooth_layout);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void logout(View view){
        finish();
    }

    public void next(View view){
        Intent intent = new Intent(this, TestMeasurement.class);
        startActivity(intent);
        finish();
    }

}
