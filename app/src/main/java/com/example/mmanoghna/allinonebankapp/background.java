package com.example.mmanoghna.allinonebankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class background extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
    }
    public void next2 (View view)
    {
        Intent i=new Intent(this,userdashboard.class);
        startActivity(i);
    }
}
