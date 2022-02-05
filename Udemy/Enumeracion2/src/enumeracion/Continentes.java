package enumeracion;

public enum Continentes {
    AFRICA(53),
    ASIA(44),
    AMERICA(34),
    EUROPA(46),
    OCEANIA(14);
        
    private int paises;
    
    //Definimos un constructor, para enviar datos a los elementos de la enumeración:
    Continentes(int paises){
        this.paises = paises;
    }
    
    //Método para retornar el número de paises:
    public int getPaises(){
        return this.paises;
    }
    
    
}
