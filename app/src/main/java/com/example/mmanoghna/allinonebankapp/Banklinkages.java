package com.example.mmanoghna.allinonebankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Banklinkages extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banklinkages);
    }
    public void upload (View view)
    {
        Intent i=new Intent(this,Uploadactivity.class);
        startActivity(i);
    }

    public void next1 (View view)
    {
        Intent i=new Intent(this,userdashboard.class);
        startActivity(i);
    }
}
