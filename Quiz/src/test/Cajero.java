package test;

import domain.Servidor;
import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroCuenta;
        double saldoInicial;
        int opcion;

        System.out.print("Bienvenido al cajero automático."
                + "\nA continuación cree su numero de cuenta: ");
        numeroCuenta = sc.nextInt();
        System.out.print("Digite el saldo inicial que desea depositar: ");
        saldoInicial = sc.nextDouble();

        System.out.println("Número de la cuenta: " + numeroCuenta
                + "\nSaldo inicial de la cuenta: " + saldoInicial);

        do {
            System.out.println("\nAhora digite una de las opciones de nuestro menú: "
                    + "\n1. Realizar consignación."
                    + "\n2. Retirar dinero."
                    + "\n3. Realizar transferencia."
                    + "\n4. Consultar saldo."
                    + "\n5. Salir.");
            opcion = sc.nextInt();
            Servidor servidor1 = new Servidor(opcion, saldoInicial);
        } while (opcion != 5);

        System.out.println("Gracias por utilizar nuestro servicio, vuelva pronto");

    }
}
