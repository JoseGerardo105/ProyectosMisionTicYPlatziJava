package test;

import empleado.Empleado;

public class Principal {

    public static void main(String[] args) {

        //Creación de 3 empleados - sin bucles:
        Empleado empleado1 = new Empleado("Juan", 1210, 2000, 2, 12);
        Empleado empleado2 = new Empleado("Jose", 21020, 2001, 2, 13);
        Empleado empleado3 = new Empleado("Angela", 1223, 1997, 7, 31);

        empleado1.subirSueldo(5);
        empleado2.subirSueldo(5);
        empleado3.subirSueldo(5);

        System.out.println("\nImpresión sin bucles");

        System.out.println("Datos empleado 1: Nombre: " + empleado1.getNombre()
                + ", Sueldo: " + empleado1.getSueldo() + ", Fecha de alta: " + empleado1.getFechaAlta());

        System.out.println("Datos empleado 2: Nombre: " + empleado2.getNombre()
                + ", Sueldo: " + empleado2.getSueldo() + ", Fecha de alta: " + empleado2.getFechaAlta());

        System.out.println("Datos empleado 3: Nombre: " + empleado3.getNombre()
                + ", Sueldo: " + empleado3.getSueldo() + ", Fecha de alta: " + empleado3.getFechaAlta());

        //Creación de 3 empleados - Bucle for:
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado("Juan", 1210, 2000, 2, 12);
        empleados[1] = new Empleado("Jose", 21020, 2001, 2, 13);
        empleados[2] = new Empleado("Angela", 1223, 1997, 7, 31);
//        
//        for (int i = 0; i < empleados.length; i++) {
//            empleados[i].subirSueldo(5);
//        }

        for (Empleado e : empleados) {
            e.subirSueldo(5);
        }

        System.out.println("\nImpresión co bucle for");
        for (int i = 0; i < 3; i++) {
            System.out.println("Datos empleado " + (i + 1) + ": Nombre: " + empleados[i].getNombre()
                    + ", Sueldo: " + empleados[i].getSueldo() + ", Fecha de alta: "
                    + empleados[i].getFechaAlta());
        }

        System.out.println("\nImpresión co bucle for each");
        int i = 1;
        for (Empleado e : empleados) {
            System.out.println("Datos empleado " + i + ": Nombre: " + e.getNombre() + ", Sueldo: " + e.getSueldo()
                    + ", Fecha de alta: " + e.getFechaAlta());
            i++;
        }
    }
}
