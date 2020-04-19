package com.JAAP.x00129619;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte Menuop = 0, tipoEmpOP =0;
        String nombre ="", puesto ="", documento ="";
        double salario;
        int extension, mesescontratos;

        do{
            System.out.println("Ingrese el nombre de la empresa: ");
            String NombreEmpresa = sc.nextLine();
            //Empresa empresa = new Empresa(NombreEmpresa);
            MainMenu();
            Menuop =  sc.nextByte();sc.nextLine();
            switch (Menuop){
                case 1:
                    System.out.println("/// AGREGAR NUEVO EMPLEADO");
                    System.out.println("POR FAVOR SELLECIONE EL TIPO DE EMPLEADO QUE AGREGARA");
                    System.out.println("1) Empleado de Servicio Profecional.");
                    System.out.println("2) Empleado de Plaza fija.");
                    System.out.println("Opcion: ");
                    tipoEmpOP = sc.nextByte();sc.nextLine();
                    switch (tipoEmpOP){
                        case 1:
                            puesto = "Servicio Profecional";
                            System.out.println("Ingrese el Nombre: ");
                            nombre = sc.nextLine();
                            System.out.println("Ingrese el Documento de Identidad: ");
                            documento = sc.nextLine();
                            System.out.println("Ingrese el salario: ");
                            salario = sc.nextDouble();sc.nextLine();
                            System.out.println("Meses de Contrato: ");
                            mesescontratos = sc.nextInt();sc.nextLine();
                            
                            ServicioProfesional empleado = new ServicioProfesional(nombre, puesto, documento, salario, mesescontratos);
                            break;
                        case 2:
                            puesto = "Plaza Fija";
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while(Menuop != 0);
    }
    static void MainMenu(){
        System.out.println("1) Agregar Empleado.");
        System.out.println("2) Despedir Empleado.");
        System.out.println("3) Ver lista de empleados.");
        System.out.println("4) Calcular sueldo.");
        System.out.println("5) Mostrar totales.");
        System.out.print("Opcion: ");
    }
}
