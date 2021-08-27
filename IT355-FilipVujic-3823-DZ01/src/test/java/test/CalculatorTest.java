/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dz01.Calculator;
import org.junit.Test;
import org.junit.Assert;
/**
 *
 * @author filip
 */
public class CalculatorTest {
    
    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        Assert.assertEquals(20, c.multiply(5, 4));
    }
    
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        Assert.assertEquals(10, c.add(4, 6));
    }
    
    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        Assert.assertEquals(6, c.subtract(7, 1));
    }
    
    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        Assert.assertEquals(2, c.divide(8, 4));
    }
}
