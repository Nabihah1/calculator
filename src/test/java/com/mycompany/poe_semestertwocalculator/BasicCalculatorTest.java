/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_semestertwocalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class BasicCalculatorTest {
    
    public BasicCalculatorTest() {
    }

    @Test
    public void testAddition() {
        
        //import class 
        BasicCalculator bc = new BasicCalculator(); 
        
        double expected = 6.00 ; 
        double actual = bc.addition(5.00, 1.00); 
        
        assertEquals(expected, actual); 
    }

    @Test
    public void testSubtraction() {
        
         //import class 
        BasicCalculator bc = new BasicCalculator(); 
        
        double expected = 100.00 ; 
        double actual = bc.subtraction(153.00, 53.00) ;
        
        assertEquals(expected, actual) ; 
    }

    @Test
    public void testDivision() {
        
         //import class 
        BasicCalculator bc = new BasicCalculator(); 
        
         double expected = 25.00; 
         double actual = bc.division(100.00,4.00) ;
         
         assertEquals(expected, actual) ;
    }

    @Test
    public void testMultiplication() {
        
         //import class 
        BasicCalculator bc = new BasicCalculator(); 
        
        double expected = 36.00 ; 
        double actual = bc.multiplication(6.00, 6.00) ; 
        
        assertEquals(expected, actual);
    }
    
}
