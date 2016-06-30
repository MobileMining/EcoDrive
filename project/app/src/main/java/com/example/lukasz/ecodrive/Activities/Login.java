package com.example.lukasz.ecodrive.Activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lukasz.ecodrive.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Lukasz on 2016-06-28.
 */
public class Login extends Activity {

    private EditText loginText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        loginText = (EditText) findViewById(R.id.loginLoginText);
        passwordText = (EditText) findViewById(R.id.passwordLoginText);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void registration(View view){
        Intent intent = new Intent(this, Registration1.class);
        startActivity(intent);
    }

    public void remeberPassword(View view){
        System.out.println("przypomnienie hasła");
    }

    public void login(View view){
        String login = loginText.getText().toString();
        String password = passwordText.getText().toString();
        if(login.equals("q") && password.equals("q")){
            Intent intent = new Intent(this, Learn.class);
            startActivity(intent);
        }
        else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Błędne dane logowania");
            AlertDialog dialog = builder.create();
            dialog.show();
        }

    }
}
