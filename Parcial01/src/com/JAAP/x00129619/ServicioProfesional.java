package com.JAAP.x00129619;

import java.util.ArrayList;

public class ServicioProfesional extends Empleado{
    private int MesesContrato;
    public ServicioProfesional(String nombre, String puesto, double salario, int mesescontratos) {
        super(nombre, puesto, salario);
        this.MesesContrato = mesescontratos;
    }
    //Getter & Setter
    public int getMesesContrato() {
        return MesesContrato;
    }
    public void setMesesContrato(int mesesContrato) {
        MesesContrato = mesesContrato;
    }
    //
}
