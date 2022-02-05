/*
Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio
imprima las propiedades del vehículo más barato. Para ello se deberan leer por teclado las
características de cada vehículo y crear una clase que represente a cada uno de ellos. 
 */
package vehiculo;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    //Imprimir caracteristicas del vehiculo mas barato:
    public String imprimirCoche() {
        return "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nPrecio: " + precio;
    }
}
