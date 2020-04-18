package com.JAAP.x00129619;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        byte Menuop = 0;
        do{
            MainMenu();
            Menuop =  sc.nextByte();sc.nextLine();
            switch (Menuop){
                case 1:
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
