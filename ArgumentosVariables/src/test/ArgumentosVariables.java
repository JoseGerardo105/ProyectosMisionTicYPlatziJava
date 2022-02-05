package test;

public class ArgumentosVariables {

    public static void main(String[] args) {
        argumentosVariables(1, 2, 3, 4);
        variosArgumentos("Juan", true, 391, 301, 33, 31);
    }

    private static void argumentosVariables(int... numeros) {
        for (int numero : numeros) {
            System.out.println("El número es: " + numero);
        }
    }

    //Ahora cuando tenemos varios argumentos en el método, el variable es el último
    private static void variosArgumentos(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Válido: " + valido);
        int contador = 0;
        for (int numero : numeros) {
            contador++;
            System.out.println("El número " + contador + " es: " + numero);
        }
    }
}
