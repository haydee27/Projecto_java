
package DEMOSTRACION;


public class ejemplo2 {
    
    public static void main(String [] args) {
        //Se hace llamado cada uno de los metodos creados
        
        metodoconVoid();
        metodoconInt();
        metodoconDouble();
        metodoconString();
    }
    
    public static void metodoconVoid(){
        System.out.println("Contenido del metodo con void");
    }
    
    public static int metodoconInt(){
        System.out.println("Contenido con el metodo int: ");
        return 0;
    }
    
    public static double metodoconDouble(){
        System.out.println("Contenido con el metodo double: ");
        return 0.0;
    }
        
    public static String metodoconString(){
        System.out.println("Contenido del metodo con string: ");
        return "";
    }
}
