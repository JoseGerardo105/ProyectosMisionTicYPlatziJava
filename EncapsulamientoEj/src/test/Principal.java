package test;

import dominio.Persona;

public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Jose", 20000000, false);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Sueldo: " + persona1.getSueldo());
        System.out.println("Estado: " + persona1.isEliminado());

        persona1.setNombe("Jose Gerardo");
        persona1.setSueldo(2500000);
        persona1.setEliminado(true);

        System.out.println("\nNombre cambiado: " + persona1.getNombre());
        System.out.println("Sueldo cambiado: " + persona1.getSueldo());
        System.out.println("Estado cambiado: " + persona1.isEliminado());
    }
}
