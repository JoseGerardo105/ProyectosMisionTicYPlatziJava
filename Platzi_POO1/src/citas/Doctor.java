package citas;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    //Atributos:
    private String nombre;
    private String apellido;
    private String especialidad;
    private int edad;

    //Métodos:
    public Doctor(String nombre, String apellido, String especialidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public int getEdad() {
        return this.edad;
    }

    ArrayList<AvailableAppointment> appointmetList = new ArrayList<AvailableAppointment>();

    public void newAppointment(Date date, int time, int id) {
        appointmetList.add(new Doctor.AvailableAppointment(date, time, id));
    }

    //Añadir clases anidadas:
    public static class AvailableAppointment {

        private static Date date;
        private static int time;
        private static int id;

        public AvailableAppointment(Date date, int time, int id) {
            this.date = date;
            this.time = time;
            this.id = id;
        }

        public static void appointmentData() {
            System.out.println("\nID: " + id
                    + "\nFecha: " + date
                    + "\nHora: " + time);
            System.out.println("\nID: " + id);
        }

    }
}
