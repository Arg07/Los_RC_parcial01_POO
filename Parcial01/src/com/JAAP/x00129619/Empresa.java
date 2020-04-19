package com.JAAP.x00129619;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla(){
        return planilla;
    }

    public void addEmpleado(Empleado e){
        planilla.add(e);
    }

    public void quitEmpleado(String n){
        planilla.remove(n);
    }

}

