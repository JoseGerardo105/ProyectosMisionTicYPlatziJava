/*
Los miembros estáticos pertenecen a la clase y no a los objetos, por lo tanto ya no hace falta
instanciar objetos sino que podemos llamarlos directamente desde la clase, además cuando creamos
nuestros objetos puede darse el caso que lo que estamos creando queramos repercuta para todos los
objetos es decir que el último sea el cambio que quede para todos los objetos, de algun atributo.
 */
package Estatico;

public class Estatico {
    
    //Atributos estáticos:
    public static int numero = 0;
    static String nombre = "Jose";
    

    //Métodos estáticos:
    public static int  sumar(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }
    
    
}
