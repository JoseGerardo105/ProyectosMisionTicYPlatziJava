package modelo;

public class Modelo {
    private int numero1;
    private int numero2;
    private int resultadoEntero;
    private double resultadoReal;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultadoEntero() {
        return resultadoEntero;
    }
    
    public double getResultadoReal(){
        return resultadoReal;
    }

    public void sumar(){
        this.resultadoEntero = numero1+numero2;
    }
    
    public void restar(){
        this.resultadoEntero = numero1-numero2;
    }
    
    public void multiplicar(){
        this.resultadoEntero = numero1*numero2;
    }
    
    public void dividir(){
        this.resultadoReal = (double)numero1/numero2;
    }
    
}
