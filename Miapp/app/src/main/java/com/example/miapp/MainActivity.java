package com.example.miapp;

import static android.Manifest.permission.CALL_PHONE;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CAMERA_PERMISSION = 100;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {
            // Si ya tiene permiso, abrir la cámara
            abrirCamara();
        } else {
            // Si no tiene permiso, solicitarlo
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.CAMERA},
                    REQUEST_CAMERA_PERMISSION);
       /* Intent ejemplo = new Intent(this, Activity2.class);
        startActivity(ejemplo);*/
        /*Intent ejemplo2 = new Intent(Intent.ACTION_VIEW);
        ejemplo2.setData(Uri.parse("https://blogsaverroes.juntadeandalucia.es/iestorrredelosguzmanes/"));
        startActivity(ejemplo2);*/
        /*Intent ejemplo3 = new Intent(Intent.ACTION_DIAL);
        ejemplo3.setData(Uri.parse("tel:+3468795307"));
        startActivity(ejemplo3);*/
        /*Intent ejemplo4 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(ejemplo4);*/

    }}

 @Override
    protected void onStart () {
     super.onStart();
     setContentView(R.layout.activity_main);
     Intent ejemplo44 = new Intent(this, Activity2.class);
     ejemplo44.putExtra("Surname", "Rendón");
     startActivity(ejemplo44);

      /*  Intent ejemplo3 = new Intent(Intent.ACTION_CALL);
        ejemplo3.setData(Uri.parse("tel:+3468795307"));
        if(ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) ==
        PackageManager.PERMISSION_GRANTED){
            startActivity(ejemplo3);
        } else{
            requestPermissions(new String[]{CALL_PHONE},1);
        }

        startActivity(ejemplo3);*/


     // Verificar si el permiso de cámara está concedido
        /*if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {
            // Si ya tiene permiso, abrir la cámara
            abrirCamara();
        } else {
            // Si no tiene permiso, solicitarlo
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.CAMERA},
                    REQUEST_CAMERA_PERMISSION);*/
 }

    private void abrirCamara() {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE); // Acción para abrir la cámara
        startActivity(intent);  // Lanzar la actividad de la cámara
    }



}