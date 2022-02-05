package persona;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad;
        long cedula;
        
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        
        System.out.print("Ingrese la cédula: ");
        cedula = sc.nextLong();
    
        Persona p1 = new Persona();
        
        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setCedula(cedula);
    
        System.out.println("El nombre es: "+p1.getNombre());
        System.out.println("La edad es: "+p1.getEdad());
        System.out.println("La cédula es: "+p1.getCedula());
    } 
}
