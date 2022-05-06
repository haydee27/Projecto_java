
package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vehiculo {
    public static void main(String[] args){
    
        double VA=0, VF=0, VS=0;
        //CREAR EL OBJETO PARA LLAMAR A LAS CLASES 
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //MANEJO DE ERRORES
        try{
            System.out.println("Ingrese el valor de vehiculo: ");
            VA= Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el valor de los fletes: ");
            VF= Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el valor del seguro del vehiculo: ");
            VS = Double.parseDouble(leer.readLine());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        double D = vehiculo.D(VA);
        
        System.out.println( "El valor de su vehiculo es: $" + VA );
        System.out.println("El costo de depreciacion es : $" + D);
        System.out.println("El costo por fletes es: $ " + VF);
        System.out.println("El costo por seguro es: $" +VS);
        System.out.println("El derecho arancelario a la importacion de su vehiculo es:$ " + vehiculo.dai(VA,D, VF, VS));
    }
    public static double D( double VA){
        //proceso para sacar la depreciacion del vehiculo
        double  Depre= VA * 0.10;
        return Depre;
    }
    
    public static double dai ( double VA, double D, double VF, double VS){
       double  DAI = (VA - D - VF - VS) * 0.25;
        
        return DAI;
    }
}
