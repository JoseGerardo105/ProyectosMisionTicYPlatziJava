package test_matrices;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Datos de la persona. Nombre: "+nombre;
    }
    
}
