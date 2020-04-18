package com.JAAP.x00129619;

public abstract class Empleado {

    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, List<Documento> documentos, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.documentos = documentos;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }
    public String getPuesto(){
        return puesto;
    }
    public List<Documento> getDocumentos() {
        return documentos;
    }
    public double getSalario() {
        return salario;
    }

    public void addDocumento(Documento d){
        documentos.add(d);
    }
    public void removeDocumento(String d){
        documentos.remove(d);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
