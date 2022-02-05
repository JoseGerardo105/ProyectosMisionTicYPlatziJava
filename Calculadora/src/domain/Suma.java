/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Suma extends Operaciones{
    
    public Suma(int num1, int num2) {
        super(num1, num2);
    }
    
    public int sumar(){
        return num1+num2;
    }
}
