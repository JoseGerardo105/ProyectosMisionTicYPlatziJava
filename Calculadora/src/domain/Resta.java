/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Tuptc
 */
public class Resta extends Operaciones{
    
    public Resta(int num1, int num2) {
        super(num1, num2);
    }
    
    
    public int restar(){
        return num1-num2;
    }
}
