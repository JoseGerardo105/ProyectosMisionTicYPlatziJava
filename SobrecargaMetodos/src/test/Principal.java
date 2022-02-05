package test;

import domain.Operaciones;

public class Principal {
    public static void main(String[] args) {
        
        System.out.println(Operaciones.sumar(1, 2));
        System.out.println(Operaciones.sumar(1.2, 10));
        
        //Si hacemos una nueva llamada con otro tipo de dato "long", por jerarquia de tipos de datos, 
        //la llamada se hará al método que contiene datos de tipo double ya que son compatibles.
        System.out.println(Operaciones.sumar(12, 14L));
    }
}
