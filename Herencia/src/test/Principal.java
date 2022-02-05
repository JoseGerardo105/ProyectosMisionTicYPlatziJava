package test;

import domain.*;
import java.time.Instant;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 12012);
        System.out.println(empleado1);

        Empleado empleado2 = new Empleado("Ana", 12122);
        System.out.println(empleado2);

        Date fecha = new Date();
        Cliente cliente1 = new Cliente("Gerardo", 'M', 20, "Vereda Santa Teresa", fecha, true);

        System.out.println(cliente1);
        
        Cliente cliente2 = new Cliente("Juan", 'M', 9, "Tuta centro", fecha, false);
        
        System.out.println(cliente2);
    }
}
