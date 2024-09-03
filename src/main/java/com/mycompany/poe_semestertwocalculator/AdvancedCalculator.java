/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_semestertwocalculator;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AdvancedCalculator extends BasicCalculator  {
    
    //create an array list to store all results 
    private ArrayList<Double>results ; 
  
    public AdvancedCalculator() {
        results = new ArrayList<>();
    }

    
    @Override 
    public double addition (double numOne, double numTwo){
    double result =super.addition(numOne, numTwo);
    storeResult(result);  //storing result into the arraylist 
    return result ; 
    }
    

    @Override 
    public double subtraction (double numOne, double numTwo){
    double result =super.subtraction(numOne, numTwo);
    storeResult(result); 
    return result ; 
    }
    

    @Override 
    public double division (double numOne, double numTwo){
    double result =super.division(numOne, numTwo);
    
    if (!Double.isNaN(result)) {
            storeResult(result);
}    
    return result ; 
    
    }

    @Override
    public double multiplication(double numOne, double numTwo) {
        double result = super.multiplication(numOne, numTwo);
        storeResult(result);
        return result;
    }

    //stores all results into an array 
    private void storeResult(double result) {
        results.add(result);
    }

    public String  displayResults() {
               
        //Use stingBuilder for concatenated strings 
        //import StringBuilder 
        StringBuilder sb = new StringBuilder() ;
        //for-loop to display all the results
       for (int i = 0; i < results.size(); i++) {
        sb.append("Result ").append(i + 1).append(": ").append(results.get(i)).append("\n");
    }
    return sb.toString();  // displays the concatenated string
}
        
        
        
} 

