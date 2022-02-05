package domain;

public class Persona {
    
    private int idPersona;
    private static int contadorPersonas;
    
    //Bloque de código estático: Es el primero que se ejecuta, se ejecutará una vez se carga la clase en
    //memoria. Una sola vez
    static{
        System.out.println("Bloque estático");
        //Solamente podemos agregar atributos de tipo estático:
        contadorPersonas++;
//        idPersona++; No es posible referenciar variables no estáticas.
    }
    
    
    //Bloque de código no estático: Se ejecuta antes del constructor de la clase. Este bloque de código
    //se va ejecutar cada vez que creamos un nuevo objeto:
    {
        System.out.println("Bloque no estático");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //Constructor:
    public Persona(){
        System.out.println("Ejecución del constructor.");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }       
    
    public String toString(){
        return "Persona {ID Persona: "+this.idPersona+"}";
    }
}
