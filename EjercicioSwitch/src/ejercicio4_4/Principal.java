package ejercicio4_4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Evaluo matrícula niño");
        System.out.print("Ingrese la edad del niño: ");
        String edad = sc.nextLine();
        ValorMatriculaNiño ninio1 = new ValorMatriculaNiño();
        while (!ninio1.validacionEdad(edad)) {
            System.out.println("Se ha digitado una edad incorrecta!");
            System.out.print("Ingrese la edad del niño: ");
            edad = sc.nextLine();
        }

        System.out.print("\n¿El niño tiene hermanos en el jardín? "
                + "\n1. Si."
                + "\n2. No."
                + "\n\t>>> ");
        String tieneHermano = sc.nextLine();
        while (!ninio1.validacionHermano(tieneHermano)) {
            System.out.println("Se ha digitado una opción incorrecta!");
            System.out.print("\n¿El niño tiene hermanos en el jardín? "
                    + "\n1. Si."
                    + "\n2. No."
                    + "\n\t>>> ");                    
                    tieneHermano = sc.nextLine();
        }
        System.out.println("El valor a pagar de la matrícula es de: $"+ninio1.valorAPagar());

    }
}
