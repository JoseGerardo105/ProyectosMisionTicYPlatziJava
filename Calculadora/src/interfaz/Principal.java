package interfaz;

import domain.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoOp;
        int num1, num2;

        System.out.print("Ingrese el tipo de operacion que desea realizar: "
                + "\n1. Suma, 2. Resta, 3. Multiplicación, 4. División: ");
        tipoOp = sc.nextInt();

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingerse el segundo número: ");
        num2 = sc.nextInt();

        switch (tipoOp) {
            case 1:
                Suma suma1 = new Suma(num1, num2);
                System.out.println("Resultado suma: "+suma1.sumar());
                break;
            case 2:
                Resta resta1 = new Resta(num1, num2);
                System.out.println("Resultado resta: "+resta1.restar());
                break;
            case 3:
                Multiplicacion multiplicacion1 = new Multiplicacion(num1, num2);
                System.out.println("Resultado multiplicación: "+multiplicacion1.multiplicar());
                break;
            case 4:
                Division division1 = new Division(num1, num2);
                System.out.println("Resultado división: "+division1.dividir());
                break;
            default:
                System.out.println("Error, el tipo de operación ingresada no existe");
        }
        
        
    }
}
