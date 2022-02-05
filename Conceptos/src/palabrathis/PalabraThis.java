/*
Uso de la palabra reservada this
*/
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("Persona 1: "+persona1);
        System.out.println("Nombre: "+persona1.nombre);
        System.out.println("Apellido: "+persona1.apellido);
    }
}

//Cuando tenemos mas de una clase en un solo archivo, solo una de las clases puede
//llevar el modificador de acceso public.
//Modificador de acceso por defecto: solo tiene acceso a clases del mismo paquete
class Persona{
    //Atributos:
    String nombre;
    String apellido;
    
    //Métodos:
    //Constructor: Con modificado de acceso default
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Impresión del objeto desde el constructor:
        System.out.println("Impresión desde constructor: "+this);
        
        //Creación de un objeto de tipo imprimir sin necesidad de variable
        new Imprimir().imprimir(this);
    }
    
    
}

class Imprimir{
    public void imprimir(Persona persona){
        //Impresión del atributo persona:
        System.out.println("Persona desde imprimir: "+persona);
        //Impresión del objeto en ejecución:
        System.out.println("Objeto en imprimir: "+this);
    }
}