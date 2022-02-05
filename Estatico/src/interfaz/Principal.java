package interfaz;

import estatico.Persona;

public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Carlos");
        Persona persona3 = new Persona("Sara");
        
         imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
    }
    
    //Si queremos hacer uso de atributos o métodos dentro de un método estático debemos tener en cuenta
    //que estos atributos y métodos también sean de tipo estático, sino será un error.
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
