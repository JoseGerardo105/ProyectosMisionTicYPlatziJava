package estatico;

public class Persona {
    private String nombre;
    private static int conteoPersonas;
    private int codigoPersona;

    public Persona(String nombre){
        this.nombre = nombre;
        //Es apropiado incrementar el valor del código persona en el constrcutor,
        //ya que este método se va creando en la invocación de nuevos objetos.
        Persona.conteoPersonas++;
        this.codigoPersona = Persona.conteoPersonas;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getCodigoPersona(){
        return codigoPersona;
    }
    public void setCodigoPersona(int codigoPersona){
        this.codigoPersona = codigoPersona;
    }
    
    public static int getConteoPersonas(){
        return conteoPersonas;
    }
    public static void setConteoPersonas(int conteoPersonas){
        Persona.conteoPersonas = conteoPersonas;
    }
    
    
    //Impresión con la ayuda del método toString()
    @Override
    public String toString(){
        return "Persona: [Nombre: "+nombre+", codigo: "+codigoPersona+"]";
    }
}
