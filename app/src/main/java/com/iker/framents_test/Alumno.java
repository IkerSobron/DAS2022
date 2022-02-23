package com.iker.framents_test;

public class Alumno {

    private String nombre;
    private String apellido;
    private String edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public Alumno(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
}
