
package ejercicios;

import java.util.Scanner;


public class Salario {
    public static void main(String [] args){
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        double A1, A2, A3, NA;
        double salario= 800.00;
        
        
        System.out.println("Escriba el Nombre del trabajador: ");
        nombre = leer.nextLine();
        System.out.println("Escriba la cantidad de ventas (Digite el 3):  ");
        NA = leer.nextDouble();
        System.out.println("Escriba el precio del 1° venta: $ ");
        A1 = leer.nextDouble();
        System.out.println("Escriba el precio del 2°venta: $ ");
        A2 = leer.nextDouble();
        System.out.println("Escriba el vaor de la 3° venta: $ ");
        A3 = leer.nextDouble();
       
       
        double TS= salario + Salario.ComisionxPorciento(A1, A2, A3) + Salario.ComisioxAuto(NA) ;
        System.out.println("El salario mas comisiones del trabajor"  + nombre + " es: $ " + TS);
    }
    
    public static double ComisioxAuto(double NA ){
        
        double TC= NA * 170.00;
        
        return TC;
    }
    
    public static double ComisionxPorciento(double P1, double P2, double P3){
        double C = 0.05;
        double TP= (P1 * C ) + (P2 * C) + (P3 * C);
        return TP;
    }
    
   
}
