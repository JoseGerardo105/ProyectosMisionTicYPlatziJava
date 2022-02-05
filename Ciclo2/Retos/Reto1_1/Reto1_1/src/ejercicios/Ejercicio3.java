/*
 * Determinar si un número es divisible por 3 y 5 al mismo tiempo,
 * por ejemplo 15 cumple, 10 no cumple
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gerardo Gómez
 */
public class Ejercicio3 {
    public void requestNumbers() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int nTimes = 0;
        boolean validation = true;

        while (nTimes == 0 || validation == false) {
            validation = true;
            try {
                System.out.print("Ingresa un número: ");
                if (nTimes > 0) {
                    sc.nextLine();
                }
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un número");
                validation = false;
            }
            nTimes++;
        }

        String state = stateNumber(number);
        printStatus(state);
    }

    private String stateNumber(int number) {
        if (number %5 == 0 && number %3 == 0) {
            return "El número  " + number + " es divisible por 3 y 5 al mismo tiempo.";
        } else {
            return "El número  " + number + " no es divisible por 3 y 5 al mismo tiempo.";
        }
    }

    public void printStatus(String stateNumber) {
        System.out.println(stateNumber);
    }
}
