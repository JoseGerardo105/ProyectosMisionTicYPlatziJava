package run_persona;

import java.util.Scanner;
import persona.Persona;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************************"
                + "\nA continuación ingrese los datos de la persona"
                + "\n***********************************************");
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Apellido: ");
        String surname = sc.nextLine();
        System.out.print("Edad (Años): ");
        int age = sc.nextInt();
        System.out.print("Género (F-M): ");
        char gender = sc.next().charAt(0);
        System.out.print("Nacionalidad: ");
        sc.nextLine();
        String nationality = sc.nextLine();
        System.out.print("Peso (Kg): ");
        double weight = sc.nextDouble();
        
        Persona persona1 = new Persona(name, surname, age, gender, nationality, weight);
        System.out.println("\n--------------------------"
                + "\n  Datos de la persona"
                + "\n--------------------------");
        System.out.println("Nombre: "+persona1.getName());
        System.out.println("Apellido: "+persona1.getSurname());
        System.out.println("Edad: "+persona1.getAge()+" años");
        System.out.println("Género: "+persona1.getGender());
        System.out.println("Nacionalidad: "+persona1.getNationality());
        System.out.println("Peso: "+persona1.getWeight()+" kg");
        
        //Ejecutamos las acciones que podría realizar la persona:
        System.out.println(persona1.comer());
        System.out.println(persona1.dormir());
        System.out.println(persona1.correr());
        System.out.println(persona1.estudiar());
        System.out.println(persona1.jugar());
    }
}
