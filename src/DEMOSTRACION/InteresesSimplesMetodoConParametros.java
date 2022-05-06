
package DEMOSTRACION;

public class InteresesSimplesMetodoConParametros {
    public static void main(String[] srgs) {
        double cantidadPrestada, tiempo, tasadeInteres;
       
        cantidadPrestada = 1500.00;
        tiempo = 0.75;
        tasadeInteres = 0.08;
        
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasadeInteres);
        System.out.println("El interes es: $" + valorInteresSimple);
        
    }
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasadeInteres) {
        double interesSimple;
        interesSimple= cantidadPrestada * tiempo * tasadeInteres;
        return interesSimple;
    }
}
