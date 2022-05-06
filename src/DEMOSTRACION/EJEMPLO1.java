

package DEMOSTRACION;

import java.util.Scanner;


public class EJEMPLO1 {
    
    public static void main (String [] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de n1: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el valor de n2:  ");
        int y = leer.nextInt();
        
        EJEMPLO1.sumar(x,y);
          
        int resta = restar(x,y);
        System.out.println("La resta es: " + resta);
        
        EJEMPLO1.multiplicar(12,5, "mario");
        
      }
    private static void sumar(int a, int b) {
        //int a = 10;
        //int b = 20;
        int suma = a + b;
        System.out.println("La suma es: " + suma);
        
    }
    
    private static int restar(int a, int b){
        int resta = a - b;
        return resta;
        
    }
    
    private static void multiplicar(int paco, int mario, String nombre){
       int mul= paco* mario;
        System.out.println("La multiplicacion es" + mul);
        System.out.println("su nombre es: " + nombre) ;
    }
}
