package domain;

import java.util.Scanner;

public class Servidor {

    private int opcion;
    private double saldoInicial;

    public Servidor(int opcion, double saldoInicial) {
        Scanner sc = new Scanner(System.in);

        this.opcion = opcion;
        this.saldoInicial = saldoInicial;

        Cuenta cuenta1 = new Cuenta();

        cuenta1.setSaldo(saldoInicial);

        switch (opcion) {
            case 1:
                System.out.print("Digite el valor que desea consignar: ");
                double valorConsignacion = sc.nextDouble();
//                cuenta1.consignaValor(valorConsignacion);

                cuenta1.setSaldo(saldoInicial + valorConsignacion);
                System.out.println("Consignación a la cuenta realizada\n");
                break;
            case 2:
                System.out.print("Digite el saldo a retirar: ");
                double valorRetiro = sc.nextDouble();
                cuenta1.retiroValor(valorRetiro);
                System.out.println("Retiro correctamente ejecutado\n");
                break;
            case 3:
                System.out.print("Digite el valor de la transferencia: ");
                double transferencia = sc.nextDouble();
                cuenta1.transferencia(transferencia);
                System.out.println("Transferencia correctamente realizada\n");
                break;
            case 4:
                System.out.println("Saldo actual: " + cuenta1.getSaldo());

                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("La opción ingresada no existe.");
                ;

        }
    }
}
