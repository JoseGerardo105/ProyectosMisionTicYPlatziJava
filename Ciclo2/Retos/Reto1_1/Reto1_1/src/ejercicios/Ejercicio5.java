/*
 * Dado el número del mes, indicar el nombre del mes. Ejm: el mes 1 es ENERO, 12 es DICIEMBRE
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Ejercicio5 {
    public void requestNumbers() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int nTimes = 0;
        boolean validation = true;

        while (nTimes == 0 || validation == false) {
            validation = true;
            try {
                System.out.print("Ingresa un número según el mes deseado: ");
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
        String message = "";
        switch (number) {
            case 1:
                message =  "El número " + number + " corresponde a Enero.";
                break;
            case 2:
                message = "El número " + number + " corresponde a Febrero.";
                break;
            case 3:
                message = "El número " + number + " corresponde a Marzo.";
                break;
            case 4:
                message = "El número " + number + " corresponde a Abril.";
                break;
            case 5:
                message = "El número " + number + " corresponde a Mayo.";
                break;
            case 6:
                message = "El número " + number + " corresponde a Junio.";
                break;
            case 7:
                message = "El número " + number + " corresponde a Julio.";
                break;
            case 8:
                message = "El número " + number + " corresponde a Agosto.";
                break;
            case 9:
                message = "El número " + number + " corresponde a Septiembre.";
                break;
            case 10:
                message = "El número " + number + " corresponde a Octubre.";
                break;
            case 11:
                message = "El número " + number + " corresponde a Noviembre.";
                break;
            case 12:
                message = "El número " + number + " corresponde a Diciembre.";
                break;
            default:
                message = "El número " + number + " no corresponde a ningún mes.";
                
        }
        
        return message;
    }

    public void printStatus(String stateNumber) {
        System.out.println(stateNumber);
    }
}
