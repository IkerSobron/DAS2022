package com.iker.framents_test;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AlumnInfoFragment extends Fragment {

    private String nombre, apellido, edad;
    private TextView tv_nombre, tv_apellido, tv_edad;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.alumno_info_fragment,container,false);
        Log.d("prueba", "onCreateView: paso por aquí");
        return v;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv_nombre= getView().findViewById(R.id.tv_nombre);
        tv_apellido= getView().findViewById(R.id.tv_apellido);
        tv_edad= getView().findViewById(R.id.tv_edad);
        tv_nombre.setText(nombre);
        tv_apellido.setText(apellido);
        tv_edad.setText(edad);
        Log.d("prueba", "onActivityCreated: paso por aquí");
    }

    public void actualizarDatos(String n, String ap, String ed){

        Log.d("prueba", "actualizarDatos: llego aquí");

        if (tv_nombre != null) {
            tv_nombre.setText(n);
            tv_apellido.setText(ap);
            tv_edad.setText(ed);
        }
        else {
            // Se añade este else porque se puede acceder a actualizarDatos antes de obtener el View en onCreateView
            // Esto ocurre cuando pasamos de la primera a la segunda actividad en modo portrait
            Log.d("prueba", "actualizarDatos: entro al else");
            nombre = n;
            apellido = ap;
            edad = ed;
        }

    }

}
