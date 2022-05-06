
package DEMOSTRACION;

public class CrearMetodoConParametros {
    public static void main( String [] args){
        System.out.println("Metodo void: ");
        MetodoConParametrosVoid( 24, 34, "Lucas");
        System.out.println("------------------");
        System.out.println("Metodo Int: ");
        metodoConParametrosInt (1);
        System.out.println("---------------");
        System.out.println("Metodo con double: ");
        MetodoConParamentroDouble (24.34);
        System.out.println("---------------");
        System.out.println("Metodo String");
        metodoConParametrosString("Lucas");
    }
    
    public static void MetodoConParametrosVoid(int ValorInt, double ValorDouble, String ValorString){
        System.out.println("Valor int: " + ValorInt); 
        System.out.println("Valor de Double: " + ValorDouble);
        System.out.println("Valor de String: " + ValorString);
        
    }
    
    public static int metodoConParametrosInt( int ValorInt){
        System.out.println("El valor de int es: "+ ValorInt);
        return ValorInt;
    }
    
     public static double MetodoConParamentroDouble( double ValorDouble){
         System.out.println("El valor de double es: " + ValorDouble);
         return ValorDouble;
     }
     
     public static String metodoConParametrosString( String ValorString){
         System.out.println("El valor de String es: ");
         return ValorString;
     }
}
