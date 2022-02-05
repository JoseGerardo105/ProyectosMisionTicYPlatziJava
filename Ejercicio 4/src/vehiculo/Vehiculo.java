/*
Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo, placa y 
precio imprima las propiedades del vehículo más barato y las propiedades del vehículo mas caro. Para
ello se deberan leer por teclado lascaracterísticas de cada vehículo y crear una clase que represente
a cada uno de ellos. 
 */
package vehiculo;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private String placa;
    private float precio;
    
    //Métodos:
    //Constructor:
    public Vehiculo(String marca, String modelo, String placa, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.precio = precio;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public String mostrarVehiculo(){
        return "\nMarca: "+marca
                +"\nModelo: "+modelo
                +"\nPlaca: "+placa
                +"\nPrecio: $"+precio;
    }
    
}
