package com.example.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity   {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba1_linearlayout);
        Bundle b = getIntent().getExtras();
        Log.i("Datos", b.getString("Surname"));

    }
}
