/*
Los atributos los vamos a encapsular de manera privada.
Set establecer
Get obtener .. En boolean usamos is.
*/
package dominio;

public class Persona {
    
    //Atributos:
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Métodos:
    //Constructor:
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //Getters and Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombe(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){
        return eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
}
