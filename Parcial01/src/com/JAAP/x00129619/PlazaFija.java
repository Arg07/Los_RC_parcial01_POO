package com.JAAP.x00129619;

import java.util.ArrayList;

public class PlazaFija extends Empleado{
    private int Extension;

    public PlazaFija(String nombre, String puesto, double salario,  int extension) {
        super(nombre, puesto, salario);
        this.Extension =  extension;
    }
    // Getter & Setter de Extension
    public int getExtension() {
        return Extension;
    }
    public void setExtension(int extension) {
        Extension = extension;
    }
}
