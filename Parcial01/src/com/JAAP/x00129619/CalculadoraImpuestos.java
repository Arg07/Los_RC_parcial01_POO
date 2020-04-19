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
        double renta, isss, afp;
        if(e instanceof PlazaFija){
            afp=(0.625*e.salario);
            totalAFP+=afp;
            isss=(0.03*e.salario);
            totalISSS+=isss;
            double restante=e.salario-totalAFP-totalISSS;
            if(e.salario > 0 && e.salario <= 472.00) {
                renta=0;
                totalRenta+=renta;
                return e.salario-=totalAFP-totalRenta-totalISSS;
            }
            else if (e.salario >= 472.01 && e.salario <= 895.24){
                renta=0.1*(restante-472)+17.67;
                totalRenta+=renta;
                return e.salario-=totalAFP-totalRenta-totalISSS;
            }
            else if(e.salario >= 895.25 && e.salario <= 2038.10){
                renta=0.2*(restante-895.240)+60;
                totalRenta+=renta;
                return e.salario-=totalAFP-totalRenta-totalISSS;
            }
            else if(e.salario >= 2038.11){
                renta=0.3*(restante-2038.10)+288.57;
                totalRenta+=renta;
                return e.salario-=totalAFP-totalRenta-totalISSS;
            }
        }
        else{
            renta=(e.salario*0.1);
            totalRenta+=renta;
            return e.salario-=totalRenta;
        }
        return 0;
    }

    public static String mostrarTotales(){
        return "Total renta: " + totalRenta + "\n" + "Total ISSS: " + totalISSS + "\n" + "Total AFP: " + totalAFP;
        }

}
