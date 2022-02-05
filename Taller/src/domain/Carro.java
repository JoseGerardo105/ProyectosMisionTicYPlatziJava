package domain;

public class Carro {
    private int velocidad;
    private int gasolina;
    
    public Carro(){
        this.velocidad = 0; 
        this.gasolina = 100;
    }
    
    public String prender(){
        return "El carro está prendido.";
    }
    
    public String apagar(){
        return "El carro está apagado";
    }
    
    public String acelerar(int acelerar){
        velocidad+=acelerar;
        gasolina-=(acelerar*0.1);
        return "El carro se está acelerando, la nueva velocidad es de: "+velocidad+
                " y el porcentaje de gasolina es de: "+gasolina;
    }
    
    public String frenar(int frenar){
        velocidad -= frenar;
        return "El carro se está frenando, la nueva velocidad es de: "+velocidad;
    }
    
}
