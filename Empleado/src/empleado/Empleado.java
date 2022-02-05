//Crear objetos de tipo empleado con: Nombre - Sueldo - Fecha de alta
package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    
    private String nombre;
    private double sueldo;
    private Date fechaAlta;
    
    public Empleado(String nombre, double sueldo, int año, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
        fechaAlta = calendario.getTime();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public Date getFechaAlta(){
        return this.fechaAlta;
    }
    
    public void subirSueldo(double porcentaje){
        double incremento = (sueldo*porcentaje)/100;
        sueldo += incremento;
    }
    
}
