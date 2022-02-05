/*
Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo, placa y 
precio imprima las propiedades del vehículo más barato. Para ello se deberan leer por teclado las
características de cada vehículo y crear una clase que represente a cada uno de ellos. 
 */
package vehiculo;

import java.util.Scanner;

public class Principal {

    //Indice del coche mas barato: 
    public static int indiceCocheMBarato(Vehiculo coches[]) {
        float barato = coches[0].getPrecio();
        int indice = 0;

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < barato) {
                barato = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    //Indice del coche mas caro: 
    public static int indiceCocheMCaro(Vehiculo coches[]) {
        float caro = coches[0].getPrecio();
        int indice = 0;

        //Evaluamos el precio y el indice del coche mas caro:
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() > caro) {
                caro = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nVehiculos;
        String marca, modelo, placa;
        float precio;

        System.out.print("Ingrese el número de vehículos: ");
        nVehiculos = sc.nextInt();

        //Creamos un arreglo de la clase vehículo:
        Vehiculo coches[] = new Vehiculo[nVehiculos];

        for (int i = 0; i < coches.length; i++) {
            sc.nextLine();
            System.out.print("Ingrese la marca: ");
            marca = sc.nextLine();
            System.out.print("Ingrese el modelo: ");
            modelo = sc.nextLine();
            System.out.print("Ingrese la placa: ");
            placa = sc.nextLine();
            System.out.print("Ingrese el precio: ");
            precio = sc.nextFloat();
            coches[i] = new Vehiculo(marca, modelo, placa, precio);
        }

        //Imprimimos las caracteristicas del coche mas caro y del coche mas barato:
        //Coche mas caro:
        int indiceCaro = indiceCocheMCaro(coches);
        System.out.println("\nCoche mas caro: " + coches[indiceCaro].mostrarVehiculo());

        //Coche mas barato:
        int indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nCoche mas barato: " + coches[indiceBarato].mostrarVehiculo());
    }
}
