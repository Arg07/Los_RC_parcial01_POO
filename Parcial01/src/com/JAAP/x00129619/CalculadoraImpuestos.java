package com.JAAP.x00129619;

public final class CalculadoraImpuestos {

    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;

    private CalculadoraImpuestos(double totalRenta, double totalISSS, double totalAFP) {
        this.totalRenta = totalRenta;
        this.totalISSS = totalISSS;
        this.totalAFP = totalAFP;
    }

    public static double calcularPago(Empleado e){
        double renta=0, isss=0, afp=0, liquido = 0, salario=e.getSalario();
        if(e instanceof PlazaFija){
            afp=(0.0625*salario);
            isss=(0.03*salario);
            double restante=salario-afp-isss;
            totalAFP+=afp;
            totalISSS+=isss;
            if(salario > 0 && salario <= 472.00) {
                renta=0;
                liquido=restante-renta;
            }
            else if (salario >= 472.01 && salario <= 895.24){
                renta=0.1*(restante-472)+17.67;
                liquido=restante-renta;
                totalRenta+=renta;
            }
            else if(salario >= 895.25 && salario <= 2038.10){
                renta=0.2*(restante-895.240)+60;
                liquido=restante-renta;
                totalRenta+=renta;
            }
            else if(salario >= 2038.11){
                renta=0.3*(restante-2038.10)+288.57;
                liquido=restante-renta;
                totalRenta+=renta;
            }
        }
        else{
            renta=(salario*0.1);
            totalRenta+=renta;
            liquido=salario-renta;
        }
        return liquido;
    }

    public static String mostrarTotales(){

        return "Total renta: " + totalRenta + "\n" + "Total ISSS: " + totalISSS + "\n" + "Total AFP: " + totalAFP + '\n';
        }

}
