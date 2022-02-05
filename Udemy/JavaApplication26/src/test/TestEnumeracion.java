package test;

import enumeracion.Dias;

public class TestEnumeracion {

    public static void main(String[] args) {

        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
    }

    //Creación de un método el cual nos indíca la enumeración que estamos trabajando
    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Es el primer dia de la semana.");
                break;
            case MARTES:
                System.out.println("Es el segundo día de la semana.");
                break;
            case MIERCOLES:
                System.out.println("Es el tercer día de la semana.");
                break;
            case JUEVES:
                System.out.println("Es el cuarto día de la semana.");
                break;
            case VIERNES:
                System.out.println("Es el quinto día de la semana.");
                break;
            case SABADO:
                System.out.println("Es el sexto día de la semana.");
                break;
            case DOMINGO:
                System.out.println("Es el septimo día de la semana.");
                break;

        }
    }

}
