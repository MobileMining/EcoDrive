package com.example.lukasz.ecodrive.Activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.lukasz.ecodrive.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Lukasz on 2016-06-30.
 */
public class EndLevel extends Activity {

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_level_layout);
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

    public void level(View view){
        Intent intent = new Intent(this, Level.class);
        startActivity(intent);
        finish();
    }
}
