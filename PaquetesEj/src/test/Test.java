package test;

//Podemos importar el paquete y las clases a usar
//import co.com.miproyecto.*;

//Podemos importar los métodos estáticos
//import static co.com.miproyecto.Utileria.imprimeMensaje;


public class Test {
    public static void main(String[] args) {
        //Utileria.imprimeMensaje("Mensaje impresión prueba 1");
        //imprimeMensaje("Mensaje de impresión prueba 2");
    
        //También podemos usar el nombre completamente calificado de la clase a usar
        co.com.miproyecto.Utileria.imprimeMensaje("Mensaje de impresión prueba 3");
    }
}
