/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz01;

/**
 *
 * @author filip
 */
public class Calculator {
    
    public int multiply(int a, int b) {
        
        return a * b;
    }
    
    public int divide(int a, int b) {
        if(b != 0)
            return a / b;
        else
            return 0;
    }
    
    public int subtract(int a, int b) {
        
        return a - b;
    }
    
    public int add(int a, int b) {
        
        return a + b;
    }
}
