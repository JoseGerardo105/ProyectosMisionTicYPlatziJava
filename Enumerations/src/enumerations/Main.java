/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumerations;

/**
 *
 * @author Tuptc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamando el enumeration
        SimpleDay myDay = SimpleDay.FRIDAY;

        switch (myDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Es un día entre semana");
                break;
            case SATURDAY:
                System.out.println("Es sábado");
                break;
            case SUNDAY:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("El día no es correcto");
        }
        
        System.out.println("");
        LenguageDay myCompuestDay = LenguageDay.SUNDAY;
        System.out.println("Mi día es: "+myCompuestDay);
        System.out.println("Mi día en español es: "+myCompuestDay.getSpanish());
        System.out.println(myCompuestDay.getDescripion());
    }
    
    

}
