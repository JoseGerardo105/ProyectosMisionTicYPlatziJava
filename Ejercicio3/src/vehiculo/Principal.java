/*
Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio
imprima las propiedades del vehículo más barato. Para ello se deberan leer por teclado las
características de cada vehículo y crear una clase que represente a cada uno de ellos., 
 */
package vehiculo;

import java.util.Scanner;

public class Principal {

    //Indice del coche mas barato:
    public static int indiceCocheMBarato(Vehiculo coches[]) {
        double barato = coches[0].getPrecio();
        int indice = 0;

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < barato) {
                barato = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroVehiculos;
        String marca, modelo;
        double precio;

        System.out.print("Ingrese la cantidad de vehículos: ");
        numeroVehiculos = sc.nextInt();

        Vehiculo coches[] = new Vehiculo[numeroVehiculos];  //Arreglo de objetos

        for (int i = 0; i < coches.length; i++) {
            sc.nextLine();
            System.out.println("\nCaracterísticas coche " + (i + 1) + ": ");
            System.out.print("Ingrese la marca: ");
            marca = sc.nextLine();
            System.out.print("Ingrese el modelo: ");
            modelo = sc.nextLine();
            System.out.print("Ingrese el precio: ");
            precio = sc.nextDouble();
            coches[i] = new Vehiculo(marca, modelo, precio);

        }

        int indiceMasBarato = indiceCocheMBarato(coches);

        System.out.println("\nCaracterísticas del vehículo mas barato: " + coches[indiceMasBarato].imprimirCoche());

    }
}
