package com.example.lukasz.ecodrive.Activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import android.widget.Spinner;

import com.example.lukasz.ecodrive.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz on 2016-06-28.
 */
public class Registration2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration2_layout);
        Spinner brand = (Spinner) findViewById(R.id.brandSpinner);
        Spinner model = (Spinner) findViewById(R.id.modelSpinner);
        Spinner engine = (Spinner) findViewById(R.id.engineSpinner);
        Spinner body = (Spinner) findViewById(R.id.bodySpinner);
        List<String> categories = new ArrayList<String>();
        categories.add("aaaaa");
        categories.add("bbbbb");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner, categories);
        brand.setAdapter(dataAdapter);
        model.setAdapter(dataAdapter);
        engine.setAdapter(dataAdapter);
        body.setAdapter(dataAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void finish(View view){
        finish();
    }
}
