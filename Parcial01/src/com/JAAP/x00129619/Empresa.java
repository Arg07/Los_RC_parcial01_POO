package com.JAAP.x00129619;

import java.util.List;

public class Empresa {

    private String nombre;
    private List<Empleado> planilla;

    public Empresa(String nombre, List<Empleado> planilla) {
        this.nombre = nombre;
        this.planilla = planilla;
    }

    public String getNombre(){
        return nombre;
    }

    public List<Empleado> getPlanilla(){
        return planilla;
    }

    public void addEmpleado(Empleado e){
        planilla.add(e);
    }

    public void quitEmpleado(String n){
        planilla.remove(n);
    }

}

