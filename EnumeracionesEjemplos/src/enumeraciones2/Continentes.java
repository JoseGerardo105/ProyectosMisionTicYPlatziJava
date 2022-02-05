package enumeraciones2;

public enum Continentes {
    //Las enumeraciones no solo contienen tipos de datos básicos, sino que estos además
    //pueden contener sus propios atributos
    AFRICA(30),
    ASIA(33),
    AMERICA(20),
    EUROPA(29),
    OCEANIA(11);

    private int numPaises;

    private Continentes(int numPaises) {
        this.numPaises = numPaises;
    }

    public int getNumPaises() {
        return this.numPaises;
    }
}
