
package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Ejer5 {
    public static void main (String [] args){
        
         Scanner l = new Scanner (System.in);
         NumberFormat formato = new DecimalFormat("#,###.##");
     
    String N ;
    double SM, LLT;
    double R = 0.10; 
    
        System.out.println("Escriba el nombre del empleado: ");
        N = l.nextLine();
        System.out.println("Escriba el salario por mes: $ ");
        SM = l.nextDouble();
        System.out.println("Minutos por llegadas tardias: ");
        LLT = l.nextDouble();
        double Descuentos = Ejer5.FormulaSalario(SM, LLT) + Ejer5.retencionPorRenta(SM, R);
       double SB = SM  - Descuentos;
       double D= Ejer5.FormulaSalario(SM, LLT);
        System.out.println("El nombre del empleado es: " + N);
        System.out.println("El descuento por llegadas tardias es: " + formato.format(D));
        System.out.println("La retencion de renta: " + Ejer5.retencionPorRenta(SM, R));
        System.out.println("El salario en bruto es: " + formato.format(SB));
        
    }
    
    public static double FormulaSalario(double SM, double LLT){
      double  S= (SM / 30) / 8  ;
      double SxM = S / 60 ;
      double desc= SxM * LLT;
       return desc; 
    }
    
    public static double retencionPorRenta(double SM, double R){
        double TR = SM * R;
        return TR;
    }   
}