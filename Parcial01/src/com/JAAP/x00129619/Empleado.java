package com.JAAP.x00129619;

import java.util.ArrayList;

abstract class Empleado {
    protected String Nombre, Puesto;
    protected ArrayList<Documento> Documentos;
    protected double Salario;

    public Empleado(String nombre, String puesto, ArrayList<Documento> documentos, double salario) {
        Nombre = nombre;
        Puesto = puesto;
        Documentos = documentos;
        Salario = salario;
    }
    //Getters

    public String getNombre() {
        return Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return Documentos;
    }

    public double getSalario() {
        return Salario;
    }
    // Set Salario

    public void setSalario(double salario) {
        Salario = salario;
    }
}
