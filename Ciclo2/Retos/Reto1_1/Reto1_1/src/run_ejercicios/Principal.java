package run_ejercicios;

import ejercicios.*;



public class Principal {
    public static void main(String[] args) {
        System.out.println("\n-----------------------------------"
                + "\nNúmero positivo, negativo o neutro"
                + "\n-----------------------------------");
        Ejercicio1 ej1 = new Ejercicio1();
        ej1.requestNumbers();
        
        System.out.println("\n------------------------------"
                + "\nNúmero par o impar"
                + "\n------------------------------");
        
        Ejercicio2 ej2 = new Ejercicio2();
        ej2.requestNumbers();
        
        System.out.println("\n------------------------------------------"
                + "\nNúmero divisible por 3 y 5 al mismo tiempo"
                + "\n------------------------------------------");
        
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.requestNumbers();
        
        System.out.println("\n--------------------------------------------------------------"
                + "\nDeducir si tres números se han introducido en orden creciente"
                + "\n--------------------------------------------------------------");
        
        Ejercicio4 ej4 = new Ejercicio4();
        ej4.requestNumbers();
        
        System.out.println("\n-----------------------------------------------"
                + "\nMes según un número ingresado"
                + "\n-----------------------------------------------");
        
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.requestNumbers();
        
    }
}
