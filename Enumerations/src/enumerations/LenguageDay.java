package enumerations;

public enum LenguageDay {
    //Un enumeration también puede tener atributos, métodos y constructores
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miércoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes", "Dia de fiesta"),
    SATURDAY("Sábado"),
    SUNDAY("Domingo", "Día de descanso");

    private String spanish;
    private String description;
    
    private LenguageDay(String spanish) {
        this.spanish = spanish;
    }

    private LenguageDay(String spanish, String description) {
        this.spanish = spanish;
        this.description = description;
    }
    
    public String getSpanish() {
        return this.spanish;
    }
    
    public String getDescripion(){
        return this.description;
    }
}
