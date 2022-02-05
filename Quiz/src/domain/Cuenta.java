/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Cuenta {

    private double saldo;

    public Cuenta() {

    }

    public void consignaValor(double valorConsigna) {
        saldo += valorConsigna;
    }

    public void retiroValor(double valorRetiro) {
        saldo -= valorRetiro;
    }

    public void transferencia(double valorTransferencia) {
        saldo -= valorTransferencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultaSaldo() {
        return saldo;
    }

}
