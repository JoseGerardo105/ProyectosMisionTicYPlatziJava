/*
Cuando hablamos de paso por referencia nos referimos a a envio de atributos de tipo objeto,
y estos van a tener un comportamiento diferente a los datos de tipo primitivo, ya que de estos
datos no se envia una copia sino el tipo de dato como tal.
 */
package pasoporreferencia;

import persona.Datos;

public class Persona {

    //Método main:
    public static void main(String[] args) {
        Datos persona1 = new Datos();
        persona1.nombre = "Jose";
        System.out.println("Nombre persona1: " + persona1.nombre);

        persona1.edad = 12;
        System.out.println("Edad persona1 " + persona1.edad);

        //Acá nos comunicamos con el método que no tiene valor de retorno
        cambioDatosSinRetorno(persona1);
        System.out.println("Nombre cambiado 1: " + persona1.nombre);
        System.out.println("Edad cambiada 1: " + persona1.edad);

        //Acá nos comunicamos con el método que si tiene valor de retorno
        persona1 = cambioDatosConRetorno(persona1);
        System.out.println("Nombre cambiado 2: " + persona1.nombre);
        System.out.println("Edad cambiada 2: " + persona1.edad);

        Datos persona2 = null;
        persona2 = cambioDatos(persona2);

    }

    //Método para cambio de valores:
    public static void cambioDatosSinRetorno(Datos persona) {
        persona.nombre = "Gerardo";
        persona.edad = 20;
    }

    //Uso de la palabra return:
    //El valor de retorno es el tipo de clase
    public static Datos cambioDatosConRetorno(Datos persona) {
        persona.nombre = "Juan";
        persona.edad = 9;
        return persona; //Esta es la variable de retorno
    }

    //Uso de null
    public static Datos cambioDatos(Datos persona) {
        if (persona == null) {
            System.out.println("Tipo de dastos null");
            return null;
        }
        return persona;
    }

}
