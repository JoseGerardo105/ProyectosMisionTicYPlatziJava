/*
El método toString lo podemos usar en nuestras clases además de los demás métodos y
atributos existentes, es muy común tenerlo, y se usa como ayuda para imprimir el estado
de nuestros objetos teniendo en cuenta los atributos ya inicializados.
 */
package ayudatostring;

public class Persona {
    private String nombre;
    private int edad;
    private boolean eliminado;
    
    public Persona(String nombre, int edad, boolean eliminado){
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado; 
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public boolean isEliminado(){
        return eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    
    //Ayuda con el método toString:
    //Return "Nombre clase "+ atributos que queremos mostrar
    public String toString(){
        return "Persona: [nombre: "+this.nombre+" edad: "+this.edad+" eliminado: "+this.eliminado+"]";
    }
}
