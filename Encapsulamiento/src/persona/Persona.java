package persona;

public class Persona {
    
    //Encaosulamiento y métodos accesores:
    //Atributos encapsulados:
    private int edad;
    private String nombre;
    private long cedula;
    
    //Metodo setter, establecer la edad.
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Método getter, obtener la edad.
    public int getEdad(){
        return edad;
    }
    
    //Método setter, establecer el nombre:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Método getter, obtener el nombre:
    public String getNombre(){
        return nombre;
    }
    
    //Método setter establecer la cédula:
    public void setCedula(long cedula){
        this.cedula = cedula;
    }
          
    //Método getter, obtener la cédula:
    public long getCedula(){
        return cedula;
    }
}
