package com.iker.framents_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AlumnListFragment.listenerDelFragment{

    ArrayList<Alumno> a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = new ArrayList<>();
        a.add(new Alumno("Miren", "Murua", "22"));
        a.add(new Alumno("Itxaso", "Ortiz de Urbina", "23"));
        a.add(new Alumno("Alaia", "Salaberria", "24"));
    }

    @Override
    public String[] cargarElementos() {
        String [] s = new String[a.size()];
        int i = 0;

        for (Alumno al : a)
            s[i++] = al.toString();

        return s;
    }

    public void seleccionarElemento(int pos) {

        String n = a.get(pos).getNombre();
        String ap = a.get(pos).getApellido();
        String e = a.get(pos).getEdad();

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //EL OTRO FRAGMENT EXISTE
            AlumnInfoFragment elotro = (AlumnInfoFragment) getSupportFragmentManager().findFragmentById(R.id.segundoFragment);
            elotro.actualizarDatos(n,ap,e);
        } else {
            //EL OTRO FRAGMENT NO EXISTE, HAY QUE LANZAR LA ACTIVIDAD QUE LO CONTIENE
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("nombre", n);
            i.putExtra("apellido", ap);
            i.putExtra("edad", e);
            startActivity(i);
        }
    }
}