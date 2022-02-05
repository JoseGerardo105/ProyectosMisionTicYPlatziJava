/*
 * Dado 3 números, deducir si se han introducido en orden creciente
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gerardo Gómez
 */
public class Ejercicio4 {
    public void requestNumbers() {
        Scanner sc = new Scanner(System.in);
        int number_1 = 0;
        int number_2 = 0;
        int number_3 = 0;
        int nTimes = 0;
        boolean validation = true;

        while (nTimes == 0 || validation == false) {
            validation = true;
            try {
                System.out.print("Ingresa el primer número: ");
                if (nTimes > 0) {
                    sc.nextLine();
                }
                number_1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un número");
                validation = false;
            }
            nTimes++;
        }
        
        nTimes = 0;
        while (nTimes == 0 || validation == false) {
            validation = true;
            try {
                System.out.print("Ingresa el segundo número: ");
                if (nTimes > 0) {
                    sc.nextLine();
                }
                number_2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un número");
                validation = false;
            }
            nTimes++;
        }
        
        nTimes = 0;
        while (nTimes == 0 || validation == false) {
            validation = true;
            try {
                System.out.print("Ingresa el tercer número: ");
                if (nTimes > 0) {
                    sc.nextLine();
                }
                number_3 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un número");
                validation = false;
            }
            nTimes++;
        }

        String state = stateNumbers(number_1,number_2,number_3);
        printStatus(state);
    }

    private String stateNumbers(int number_1, int number_2, int number_3) {
        if (number_1 < number_2 && number_2 < number_3) {
            return "Los números "+number_1+" - "+number_2+" - "+number_3+" se encuentran ordenados de forma creciente.";
        } else {
            return "Los números "+number_1+" - "+number_2+" - "+number_3+" se encuentran desordenados.";
        }
    }

    public void printStatus(String stateNumber) {
        System.out.println(stateNumber);
    }
}
