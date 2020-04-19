package com.JAAP.x00129619;

public class Documento {
    private String Nombre, Numero;

    public Documento(String nombre, String numero) {
        this.Nombre = nombre;
        this.Numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNumero() {
        return Numero;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "Nombre='" + Nombre + '\'' +
                ", Numero='" + Numero + '\'' +
                '}';
    }
}
