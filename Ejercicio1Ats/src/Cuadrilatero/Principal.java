package Cuadrilatero;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado1, lado2;

        System.out.print("Ingrese el valor de la base: ");
        lado1 = sc.nextInt();

        System.out.print("Ingrese el valor de la altura: ");
        lado2 = sc.nextInt();

        Cuadrilatero c1;

        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El área es: " + c1.area());
        System.out.println("El perímetro es: " + c1.perimetro());
    }
}
