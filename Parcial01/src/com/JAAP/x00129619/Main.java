package com.JAAP.x00129619;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws CustomException {
        byte Menuop = 0, tipoEmpOP =0, cantDocs=0;
        String nombre ="", puesto ="", documento ="", documentonum="";
        double salario;
        int extension, mesescontratos;
        System.out.print("Ingrese el nombre de la empresa: ");
        String NombreEmpresa = sc.nextLine();
        Empresa empresa = new Empresa(NombreEmpresa);

        do{
            boolean A = false;
            do{
            try{
                A = false;
                MainMenu(NombreEmpresa);
                Menuop =  sc.nextByte();sc.nextLine();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("ERROR!, Opcion invalida, su opcion debe ser un entero sin espacios");
                A = true;
            }
            }while (A);
            //MainMenu(NombreEmpresa);
            //Menuop =  sc.nextByte();sc.nextLine();
            switch (Menuop){
                case 1:
                    boolean B = false;
                    do{
                        try {
                            B = false;
                            System.out.println("----------AGREGAR NUEVO EMPLEADO----------");
                            System.out.println("Por favor seleccione el tipo de empleado que agregara");
                            System.out.println("1) Empleado de Servicio Profesional");
                            System.out.println("2) Empleado de Plaza Fija");
                            System.out.println("0) Regresar");
                            System.out.print("Opcion: ");
                            tipoEmpOP = sc.nextByte();
                            sc.nextLine();
                        }catch (InputMismatchException e){
                            sc.nextLine();
                            System.out.println("ERROR!, Opcion invalida, su opcion debe ser un entero sin espacios");
                            B = true;
                        }

                    }while(B);

                    switch (tipoEmpOP){
                        case 1:
                            try {
                                System.out.print("Ingrese el Nombre: ");
                                nombre = sc.nextLine();
                                System.out.print("Ingrese el puesto de trabajo: ");
                                puesto = sc.nextLine();
                                System.out.print("Ingrese el salario: ");
                                salario = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Meses de Contrato: ");
                                mesescontratos = sc.nextInt();
                                sc.nextLine();
                                ServicioProfesional empleado = new ServicioProfesional(nombre, puesto, salario, mesescontratos);
                                System.out.print("Ingrese la cantidad de documentos a ingresar: ");
                                cantDocs = sc.nextByte();
                                sc.nextLine();
                                for (int i = 0; i < cantDocs; i++) {
                                    System.out.print("Ingrese el tipo de documento: ");
                                    documento = sc.nextLine();
                                    System.out.print("Ingrese el numero de documento: ");
                                    documentonum = sc.nextLine();
                                    Documento d = new Documento(documento, documentonum);
                                    try {
                                        ConditionsString(documento);
                                    } catch (CustomException e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    empleado.addDocumento(d);
                                }
                                try {
                                    ConditionsString(nombre);
                                    ConditionsString(puesto);
                                    empresa.addEmpleado(empleado);
                                } catch (CustomException e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                                sc.nextLine();
                            }catch (InputMismatchException e){
                                sc.nextLine();
                                System.out.println("No debe ingresar letras ni espacios");
                            }
                            break;
                        case 2:
                            try{
                            System.out.print("Ingrese el Nombre: ");
                            nombre = sc.nextLine();
                            System.out.print("Ingrese el puesto de trabajo: ");
                            puesto = sc.nextLine();
                            System.out.print("Ingrese el salario: ");
                            salario = sc.nextDouble();sc.nextLine();
                            System.out.print("Extension de la oficina: ");
                            extension = sc.nextInt();sc.nextLine();
                            PlazaFija empleadopf = new PlazaFija(nombre, puesto, salario, extension);
                            System.out.print("Ingrese la cantidad de documentos a ingresar: ");
                            cantDocs = sc.nextByte(); sc.nextLine();
                            for(int i=0; i<cantDocs; i++){
                                System.out.print("Ingrese el tipo de documento: ");
                                documento=sc.nextLine();
                                System.out.print("Ingrese el numero de documento: ");
                                documentonum=sc.nextLine();
                                Documento doc = new Documento(documento, documentonum);
                                try{
                                    ConditionsString(documento);
                                }catch (CustomException e){
                                    System.out.println("Error: "+ e.getMessage());
                                }
                                empleadopf.addDocumento(doc);
                            }
                            try{
                                ConditionsString(nombre);
                                ConditionsString(puesto);
                                empresa.addEmpleado(empleadopf);
                            }catch (CustomException e){
                                System.out.println("Error: "+ e.getMessage());
                            }
                                sc.nextLine();
                            }catch (InputMismatchException e){
                                sc.nextLine();
                                System.out.println("No debe ingresar letras ni espacios");
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("-------Despididiendo a un empleado-------");
                    System.out.print("Igrese el nombre del empleado:");
                    String nameDespedido = sc.nextLine();
                    try {
                        ConditionsString(nameDespedido);
                    }catch (CustomException e){
                    System.out.println("Error: "+ e.getMessage());
                    }
                    empresa.quitEmpleado(nameDespedido);
                    break;
                case 3:
                    System.out.println(empresa.toString());
                    break;
                case 4:
                    System.out.println("----------Calculadora de sueldos----------");
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nomCalc=sc.nextLine();
                    try {
                        ConditionsString(nomCalc);
                    }catch (CustomException e){
                        System.out.println("Error: "+ e.getMessage());
                    }
                    for(Empleado aux : empresa.getPlanilla()) {
                        if(aux.getNombre().equalsIgnoreCase(nomCalc)){
                            System.out.print("El sueldo liquido es: ");
                            System.out.print(CalculadoraImpuestos.calcularPago(aux));
                            System.out.println(" dolares.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Los totales son: ");
                    System.out.print(CalculadoraImpuestos.mostrarTotales());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while(Menuop != 0);
    }
    static void ConditionsString(String Campo) throws CustomException{
        if(Campo.equals(""))
            throw new CustomException("No puede dejar el campo vacio");
        boolean number = false;
        char [] variable = Campo.toCharArray();
        for(char c: variable){
            if(Character.isDigit(c))
                number = true;
        }
        if(number==true)
            throw new CustomException("El Dato "+Campo+" no debe contener numeros");
    }

    static void MainMenu(String x){
        System.out.println("");
        System.out.println("----------" + x + "----------");
        System.out.println("1) Agregar Empleado.");
        System.out.println("2) Despedir Empleado.");
        System.out.println("3) Ver lista de empleados.");
        System.out.println("4) Calcular sueldo.");
        System.out.println("5) Mostrar totales.");
        System.out.println("0) Salir.");
        System.out.print("Opcion: ");
    }
}
