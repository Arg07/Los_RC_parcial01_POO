package com.JAAP.x00129619;

<<<<<<< HEAD
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
=======
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
>>>>>>> 846422c4362ed75f8ad3d040c18fd5c297b7b283
    }
}
