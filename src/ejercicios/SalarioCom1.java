
package ejercicios;

import java.util.Scanner;


public class SalarioCom1 { 
  public static void main (String[] args){
      
      Scanner L = new Scanner(System.in);
      
      String N;
      double SB = 300.00;  double C ;
      double CxC = 50.00;  double P1, P2, P3;
      
      System.out.println("Ingrese el nombre del trabajador: ");
      N = L.nextLine();
      System.out.println("Ingrese el total de ventas: (Digite el numero 3): ");
      C = L.nextDouble();
      System.out.println("Ingrese el precio de la 1° venta: $ ");
      P1 = L.nextDouble();
      System.out.println("Ingrese el precio de la 2° venta: $ ");
      P2 = L.nextDouble();
      System.out.println("Ingrese el precio de la 3° venta: $ ");
      P3 = L.nextDouble();
      
    
      double SD = SB + SalarioCom1.ComisionVenta1(C, CxC) + SalarioCom1.ComisionVenta2(P1, P2, P3);
      
      System.out.println("Su nombre es : " + N);
      System.out.println("Su salario devengado es: $ " + SD);
      System.out.println("El total de la rentencion de renta de su salario es: $ " + SalarioCom1.Renta(SD));
  }  
  
  public static double ComisionVenta1 ( double C, double CxC){
      
      double Comi = C * CxC;
      return Comi;
  }
  
  public static double ComisionVenta2 ( double P1, double P2, double P3){
      
      double resultado = (P1 * 0.10) + (P2 * 0.10) + (P3 * 0.10);
      
      return resultado;
  }
  
  public static double Renta ( double SD){
      
      double TS = SD * 0.10;
      return TS;
  }
}
