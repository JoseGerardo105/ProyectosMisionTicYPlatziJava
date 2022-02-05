package test;

import domain.Carro;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Digite la opción que desea realizar con el coche: "
                + "\n1. Prender el carro."
                + "\n2. Apagar el carro."
                + "\n3. Acelerar."
                + "\n4. Frenar.");
        opcion = sc.nextInt();

        Carro carro = new Carro();

        switch (opcion) {
            case 1:
                System.out.println(carro.prender());
                break;
            case 2:
                carro.apagar();
                break;
            case 3:
                System.out.print("Ingrese el valor de incremento en la aceleración: ");
                int aceleracion = sc.nextInt();
                carro.acelerar(aceleracion);
                break;
            case 4:
                System.out.print("Ingrese el valor que desea decrementar en la aceleración: ");
                int freno = sc.nextInt();
                carro.frenar(freno);
                break;
            default:
                System.out.println("Lo sentimos, la opción ingresada no existe.");
        }
    }
}
