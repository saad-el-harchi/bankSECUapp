package com.example.banksecuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mLoginEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginEditText = (EditText) findViewById(R.id.namelogin);
        mPasswordEditText = (EditText) findViewById(R.id.passwordlogin);

        findViewById(R.id.loginbutton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String login;
        if(TextUtils.isEmpty(mLoginEditText.getText())){
            Toast.makeText(this, "empty login", Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(mPasswordEditText.getText())){
            Toast.makeText(this, "empty password", Toast.LENGTH_LONG).show();
            return;
        }




    }
}