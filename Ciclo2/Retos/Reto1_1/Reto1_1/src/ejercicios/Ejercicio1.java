/*Ejercicio1:*
*Determinar si un número es positivo o negativo
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gerardo Gómez
 */
public class Ejercicio1 {

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
        if (number < 0) {
            return "El número " + number + " es negativo.";
        } else if (number == 0) {
            return "El número " + number + " es neutro.";
        } else {
            return "El número " + number + " es positivo.";
        }
    }

    public void printStatus(String stateNumber) {
        System.out.println(stateNumber);
    }
}
