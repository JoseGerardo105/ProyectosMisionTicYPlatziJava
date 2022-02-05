
package aritmetica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
    
        Suma suma1 = new Suma(num1, num2);
        int suma = suma1.sumar();
        
        System.out.println("La suma es: "+suma);
        
        Suma suma2 = new Suma();
        
        suma = suma2.sumarConArgumentos(1, 22);
        System.out.println("Suma con argumentos es: "+suma);
        
    }
}
