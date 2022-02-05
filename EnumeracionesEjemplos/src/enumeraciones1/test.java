package enumeraciones1;

public class test {

    public static void main(String[] args) {
        System.out.println("El primer día de la semana es: " + Dias.LUNES);
        diaCorrespondiente(Dias.VIERNES);
        
    }

    //Indicar a que corresponde un determinado día de la semana
    public static void diaCorrespondiente(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer día de la semana.");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana.");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana.");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana.");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana.");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana.");
                break;
            case DOMINGO:
                System.out.println("Séptimo día de la semana.");
                break;
            default:
                System.out.println("No corresponde a ningún día de la semana el valor ingresado!");
                break;
        }
    }
}
