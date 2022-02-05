
package test;

//Tenemos distintas formas para imprimir el resultado del método de Utileria, ya que es un método estático
import co.com.globalmentoring.Utileria;
import static co.com.globalmentoring.Utileria.imprimir;


public class Pricipal {
    public static void main(String[] args) {
        
        Utileria.imprimir("1dcd");
        
        imprimir("Hola que tal");
        
        //Nombre completamente calificado: no hay necesidad de utilizar ningún import
        co.com.globalmentoring.Utileria.imprimir("scdc");
        
        
    }
    
}
