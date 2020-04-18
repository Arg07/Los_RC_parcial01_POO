package com.JAAP.x00129619;

import java.util.ArrayList;

public class ServicioProfesional extends Empleado{
    private int MesesContrato;
    public ServicioProfesional(String nombre, String puesto, ArrayList<Documento> documentos, double salario, int mesescontratos) {
        super(nombre, puesto, documentos, salario);
        MesesContrato = mesescontratos;
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
