package com.iker.framents_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("prueba", "onCreate: " + "entro");
        AlumnInfoFragment elotro = (AlumnInfoFragment) getSupportFragmentManager().findFragmentById(R.id.segundoFragment);
        String n = getIntent().getStringExtra("nombre");
        String a = getIntent().getStringExtra("apellido");
        String e = getIntent().getStringExtra("edad");
        Log.d("prueba", "onCreate: " + n);
        Log.d("prueba", "onCreate: " + a);
        Log.d("prueba", "onCreate: " + e);


//        Log.d("prueba", "onCreate1: "+ n);
//        Bundle extras = getIntent().getExtras();
//        if (extras != null && elotro!= null) {
//            n= extras.getString("nombre");
//            a= extras.getString("apellido");
//            e= extras.getString("edad");
//            elotro.actualizarDatos(n, a, e);
//            Log.d("prueba", "onCreate2: "+ n);
//        }
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("nombre", n);
            i.putExtra("apellido", a);
            i.putExtra("edad", e);
            startActivity(i);
            finish();
        } else {
            elotro.actualizarDatos(n, a, e);
        }
    }
}