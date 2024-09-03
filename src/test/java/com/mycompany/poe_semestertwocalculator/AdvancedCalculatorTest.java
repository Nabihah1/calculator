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
public class AdvancedCalculatorTest {
    
    public AdvancedCalculatorTest() {
    }

    @Test
    public void testAddition_resulstStored() {
        
      //import class 
      AdvancedCalculator ac = new AdvancedCalculator() ; 
      
      //adds the digits 
      double add = ac.addition(15.00, 2.00); 
      //stores results after it was added 
      String actual = ac.displayResults() ;
      //displays the output 
      String expected = "Result 1: 17.0";
       
      
      assertEquals(expected, actual ) ;
        
    }

    @Test
    public void testSubtraction_resultsStored() {
        
       //import class 
      AdvancedCalculator ac = new AdvancedCalculator() ;  
      
       //subtracts the digits 
      double subtract= ac.subtraction(15.00, 2.00); 
      //stores results after it was added 
      String actual = ac.displayResults() ;
      //displays the output 
      String expected = "Result 1: 13.0";
       
      
      assertEquals(expected, actual ) ; 
    }

    @Test
    public void testDivision_resultsStored() {
        
      //import class 
      AdvancedCalculator ac = new AdvancedCalculator() ;  
      
      //divide the digits 
      double divide = ac.division(15.00, 3.00); 
      //stores results after it was added 
      String actual = ac.displayResults() ;
      //displays the output 
      String expected = "Result 1: 5.0";
       
      
      assertEquals(expected, actual ) ;
        
    }

    @Test
    public void testMultiplication_resultsStored() {
        
        //import class 
      AdvancedCalculator ac = new AdvancedCalculator() ; 
      
      //multiply the digits 
      double multiply = ac.multiplication(15.00, 2.00); 
      //stores results after it was added 
      String actual = ac.displayResults() ;
      //displays the output 
      String expected = "Result 1: 30.0";
       
      
      assertEquals(expected, actual ) ;
        
    }

    @Test
    public void testDisplayResults_resultsStored() {
        
      //import class 
      AdvancedCalculator ac = new AdvancedCalculator() ;   
        
    }
    
}
