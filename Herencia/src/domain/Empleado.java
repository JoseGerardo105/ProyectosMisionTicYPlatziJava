package domain;

public class Empleado extends Persona{
    //Empleados hereda de Persona, y ya no tendrá clases hijas:
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        contadorEmpleado++;
        idEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre empleado=" + this.nombre + ", sueldo=" + this.sueldo + ", Id empleado=" + this.idEmpleado + '}';
    }
    
    
}
