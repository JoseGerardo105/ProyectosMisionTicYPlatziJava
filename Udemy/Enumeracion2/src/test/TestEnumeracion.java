package test;

import enumeracion.Continentes;

public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println("Continente 1: "+Continentes.AFRICA);
        System.out.println("Continente 2: "+Continentes.ASIA);
        System.out.println("Continente 3: "+Continentes.AMERICA);
        System.out.println("Continente 4: "+Continentes.EUROPA);
        System.out.println("Continente 5: "+Continentes.OCEANIA);
        
        System.out.println("Número de paises continente 1: "+Continentes.AFRICA.getPaises());
        System.out.println("Número de paises continente 2: "+Continentes.ASIA.getPaises());
        System.out.println("Número de paises continente 3: "+Continentes.AMERICA.getPaises());
        System.out.println("Número de paises continente 4: "+Continentes.EUROPA.getPaises());
        System.out.println("Número de paises continente 5: "+Continentes.OCEANIA.getPaises());
    }
}
