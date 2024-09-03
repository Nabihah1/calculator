/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_semestertwocalculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class POE_SemesterTwoCalculator {

    public static void main(String[] args) {
       
        
        /* 
        This calculator allows the user to add, subtract, multiply, divide and show all the stored results  
        The parent class 'basicCalculator' will contain 4 methods to calculate the addition, subtraction, multiplication, dividion of digits. 
        While the child class 'AdvancedCalculator' will have 1 method to display all stored results. 
        An arrayList will be used to store all results. 
        */
        
        //Declarations 
        double numOne ; 
        double numTwo ; 
        double result ; 
        
        //create an array list to store all results  
         ArrayList<Double>results; 
        
         //Create an import for scanner 
        Scanner kb = new Scanner(System.in);
        
        //create an instance of the class 
        BasicCalculator bc = new BasicCalculator() ;
        AdvancedCalculator ac = new AdvancedCalculator() ; 
                    
        
        //Display name of application          
        System.out.println("   C A L C U L A T O R ") ; 
                           
        while (true){
        //Display menu options
            System.out.println("*****************************************");
        System.out.println("Please select one of the following menu options: "
                          + "\n (1) Add 2 digits. "
                          + "\n (2) Subtract 2 digits."
                          + "\n (3) Divide 2 digits."
                          + "\n (4) Multiply 2 digits."
                          + "\n (5) Display all stored digits."
                          + "\n (6) Exit Application. "); 
            System.out.println("*****************************************");
        
            
        //Convert menu options to integer
        int menu = kb.nextInt();
        kb.nextLine();
        
        switch (menu) {
            case 1 :
                System.out.println("\nPlease enter the first value to add: ");
                numOne = kb.nextDouble(); 
                System.out.println("Please enter the second value to add: ");
                numTwo = kb.nextDouble(); 
                
                result = ac.addition(numOne, numTwo) ; 
                System.out.println("The sum of " + numOne + " and " + numTwo + " is --> " + result);
                kb.nextLine(); 
             break ; 
             
            case 2: 
                System.out.println("\nPlease enter the first value to subtract: ");
                numOne = kb.nextDouble(); 
                System.out.println("Please enter the second value to add: ");
                numTwo = kb.nextDouble(); 
                
                result = ac.subtraction(numOne, numTwo) ; 
                System.out.println("The subtraction of " + numOne + " and " + numTwo + " is --> " + result);
                kb.nextLine(); 
                break ; 
                
            case 3: 
               System.out.println("\nPlease enter the first value to divide: ");
                numOne = kb.nextDouble(); 
                System.out.println("Please enter the second value to divide: ");
                numTwo = kb.nextDouble(); 
                
                result = ac.division(numOne, numTwo) ; 
                System.out.println("The division of " + numOne + " and " + numTwo + " is --> " + result);
                kb.nextLine(); 
                break ; 
                
            case 4: 
                System.out.println("\nPlease enter the first value to multiply: ");
                numOne = kb.nextDouble(); 
                System.out.println("Please enter the second value to multiply: ");
                numTwo = kb.nextDouble(); 
                
                result = ac.multiplication(numOne, numTwo) ; 
                System.out.println("The multiplication of " + numOne + " and " + numTwo + " is --> " + result);
                kb.nextLine(); 
                break ; 
        
            case 5 :
               String display = ac.displayResults();
                System.out.println(display);
                
                if (display.isEmpty()) {
                    System.out.println("No results have been enterred yet. ");
                }
               
               break ; 
        
                
            case 6 :
                System.out.println("Thank you for using this application!");
                kb.close();
                return ; 
                
            default :
                System.out.println("Incalid option chosen!\nPlease try again!");
                kb.nextLine(); 
        
        }
        }
    

        


        
        
        
        
        
        


    }
}
