
package entrada.desde.teclado;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;



public class CalcularDai {
    public static void main (String[] args ){
        Scanner leer = new Scanner(System. in);
        
        NumberFormat formato = new DecimalFormat("$#,###.##");
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la maquina: ");
        valorMaquina= leer.nextDouble();
        System.out.println("Valor de flete de la maquina: ");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro de la maquina: ");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + formato.format(valorDai));
        System.out.println("Valor del IVA: " + formato.format(valorConIva));
    }
    //Crear metodo para dai
    
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorMaquina - valorFlete- valorSeguro) * 0.10;
        return dai;
    }
    
    public static double obtenerIva (double dai){
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
        return pagoConIva;
    }
}
