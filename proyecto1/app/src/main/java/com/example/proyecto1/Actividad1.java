package com.example.proyecto1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);Bundle b = getIntent().getExtras();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent ejemplo = new Intent(this, Actividad2.class);
        startActivity(ejemplo);
    }

}
