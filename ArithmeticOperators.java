/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticoperators;

import java.util.Scanner; //import scanner to read user input

public class ArithmeticOperators {
    public static void main(String[] args) { //Main body
        
        Scanner baca = new Scanner(System.in); //Create Scanner object called as baca
        float num1, num2, result; //num1 & num2 & result as data type float
        int choice; //choise as data type int

        System.out.print("Enter your first number: "); // Get user input for numbers
        num1 = baca.nextFloat(); //Save input from user - nextFloat are called as input float type
        
        System.out.print("Enter your second number: "); // Get user input for numbers
        num2 = baca.nextFloat(); //Save input from user
        
        System.out.println("Choose an operation:"); // Display menu for arithmetic operations
        System.out.println("1. Addition"); //1st option
        System.out.println("2. Subtraction"); //2nd option
        System.out.println("3. Multiplication"); //3rd option
        System.out.println("4. Division"); //4th option
        System.out.println("5. Modulus"); //5th option

        System.out.print("Enter your choice (1-5): "); // Get user choice
        choice = baca.nextInt(); //Save input from user
        
        result = 0; //Set the default result as 0
        
        switch (choice) { // Perform the chosen arithmetic operation
        
        case 1:
                // Addition
                result = num1 + num2; //Calculation
                System.out.println("Result: " + result); break; //Print result and terminate switch case 
        case 2:
                // Subtraction
                result = num1 - num2; //Calculation
                System.out.println("Result: " + result); break; //Print result and terminate switch case 
        case 3:
                // Multiplication
                result = num1 * num2; //Calculation
                System.out.println("Result: " + result); break; //Print result and terminate switch case 
        case 4:
                // Division
                result = num1 / num2; //Calculation
                System.out.println("Result: " + result); break; //Print result and terminate switch case 
        case 5:
                // Modulus
                result = num1 % num2; //Calculation
                System.out.println("Result: " + result); break; //Print result and terminate switch case 
        default:
                // Invalid choice
                System.out.println("Invalid choice."); break; //Print invalid and terminate switch case 
        }
        
    }
}