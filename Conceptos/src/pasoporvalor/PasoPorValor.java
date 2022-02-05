/*
Paso por valor, se utiliza con tipos de datos promitivos y los valores que se envian son solo una copia de la variable
*/
package pasoporvalor;

public class PasoPorValor {
    
    //Métodos:
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Numero: " + numero);
        cambioValor1(numero);//Este método no retorna ningun valor el valor que se envia solo es una copia
        System.out.println("Cambio número 1: "+numero);
        
        //Ahora, si creamos un método con un valor de retorno y enviamos un dato entero:
        numero = cambioValor2(numero);
        System.out.println("Cambio número 1: " + numero);
        
    }

    public static void cambioValor1(int numero){
        numero = 15;
    }
    
    public static int cambioValor2(int numero){
        numero = 15;
        return numero;
    }
}
