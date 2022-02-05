package domain;

public class Persona {
    protected String nombre;
    protected char genero;
    protected String direccion;
    protected int edad;
    
    //Podemos crear varios constructores para inicializar de distintas formas los atributos de nuestros objetos
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }    
    
    public Persona(String nombre, char genero, String direccion, int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    //Get y set de cada atributo:
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(){
        this.genero = genero;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    //Método toString():
    @Override
    public String toString(){
        return "Persona: [nombre: "+this.nombre+
                ", genero: "+this.genero+
                ", direccion: "+this.direccion+
                ", edad: "+this.edad;
    }
    
}
