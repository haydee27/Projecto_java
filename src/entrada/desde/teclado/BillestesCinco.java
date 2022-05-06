
package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BillestesCinco {
    public static void main (String [] args){
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        String cantidadDinero;
        
        try{
            System.out.println("Cantidad1: ");
            cantidadDinero = leer.readLine();
            String cantidadCinco = BillestesCinco.obtenerBilletesCinco(cantidadDinero);
            System.out.println("Cantidad de billetes de $ 5.00: "  + cantidadCinco);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }         
    }
    
    public static String obtenerBilletesCinco (String cantidadDinero){
         
        String resultado;
        
        double montoDinero = Double.parseDouble(cantidadDinero);
        int billetesCinco = (int) montoDinero/5;
        resultado = String.valueOf(billetesCinco);
        
        return resultado;
              
    }
}
