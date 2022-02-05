package citas;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        
        //Creación de arreglo de doctores
        ArrayList <Doctor> listaDoctores = new ArrayList <Doctor>();
        
        //Agregación de doctores a la colección:
        listaDoctores.add(new Doctor("Juan", "Gómez", "Pediatría", 10));
        listaDoctores.add(new Doctor("Fernanda", "Gonzalez", "Dentista", 20));
        
        //Obtener elementos del ArratList
        int contador = 1;
        int counterList = 1;
        for (Doctor listaD : listaDoctores) {
            System.out.println("Datos doctor "+contador+": "+
                    "\nNombre: "+listaD.getNombre()+
                    "\nApellido: "+listaD.getApellido()+
                    "\nEspecialidad: "+listaD.getEspecialidad()+
                    "\nEdad: "+listaD.getEdad());
            listaD.newAppointment(new Date(), 12, contador);
            counterList++;
            listaD.newAppointment(new Date(), 1, contador);
            counterList++;
            listaD.newAppointment(new Date(), 2, contador);
            counterList++;
            contador++;
            listaD.;
        }
        
       //Ver cuantos elementos tiene nuestro ArrayList:
        System.out.println("Número de elementos: "+listaDoctores.size());
        
        
        
    }
}
