/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice
su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada
movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro
del tablero
 */
package movimiento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char tipoMovimiento;
        int opcion;

        do {
            System.out.print("Desea hacer cambios de posicion en el tablero: (1: Si, 2: No): ");
            opcion = sc.nextInt();
            if (opcion != 1 && opcion != 2) {
                System.out.println("Error, la opción digitada no existe.");
            }
        } while (opcion != 1 && opcion != 2);

        while (opcion == 1) {
            sc.nextLine();
            System.out.println("Ingrese la dirección que desea elegir para el movimiento: "
                    + "\nARRIBA = W"
                    + "\nABAJO = S"
                    + "\nIZQUIERDA = A"
                    + "\nDERECHA = D");

            tipoMovimiento = sc.nextLine().charAt(0);

            Movimiento tablero = new Movimiento(tipoMovimiento);

            System.out.println(tablero.getTipoMovimiento());
            System.out.println(tablero.mostrarDatos());
        
            do {
                System.out.println("Desea hacer cambios de posicion en el tablero: (1: Si, 2: No.)");
                opcion = sc.nextInt();
                if (opcion != 1 && opcion != 2) {
                    System.out.println("Error, la opción digitada no existe.");
                }
            } while (opcion != 1 && opcion != 2);
        }

    }

}
