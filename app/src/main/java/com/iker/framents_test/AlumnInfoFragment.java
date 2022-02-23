package com.iker.framents_test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AlumnInfoFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.alumno_info_fragment,container,false);
        return v;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView nombre= getView().findViewById(R.id.tv_nombre);
        TextView apellido= getView().findViewById(R.id.tv_apellido);
        TextView edad= getView().findViewById(R.id.tv_edad);
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
    }

    public void actualizarDatos(String n, String ap, String ed){

        TextView nombre= getView().findViewById(R.id.tv_nombre);
        TextView apellido= getView().findViewById(R.id.tv_apellido);
        TextView edad= getView().findViewById(R.id.tv_edad);
        nombre.setText(n);
        apellido.setText(ap);
        edad.setText(ed);

    }

}
