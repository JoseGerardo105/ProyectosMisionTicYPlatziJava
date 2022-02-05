/*
Ejercicio 1:
Construir un programa que calcule el área y perímetro de un cuadrilatero dada la longitud de sus dos lados.
Los valores de la longitud deberan introducirse por líneas de órdenes. Si es un cuadrado solo se proporcionará
la longitud de uno de los lados al constructor.
 */
package Cuadrilatero;

public class Cuadrilatero {
   private int lado1;
   private int lado2;
   
   public Cuadrilatero(int lado1, int lado2){
       this.lado1 = lado1;
       this.lado2 = lado2;
   }
   
   public Cuadrilatero(int lado1){
       this.lado1=this.lado2 = lado1;
   }
   
   //Area
   public int area(){
       int area;
       area = lado1*lado2;
       return area;
   }
   
   //Perimetro:
   public int perimetro(){
       int perimetro;
       perimetro=(lado1+lado2)*2;
       return perimetro;
   }
    
}
