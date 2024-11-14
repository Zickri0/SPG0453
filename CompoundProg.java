/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compoundprog;
import java.util.Scanner;
public class CompoundProg {    
    public static void main(String[] args) {
        int number, resultValue;
        Scanner scan = new Scanner(System.in);
        
        // Get user input for the initial value of the variable
        System.out.print("Enter the initial value for the variable: ");
        number = scan.nextInt();
   
        System.out.println("\nPrefix Operations: ");
        
        // Pre-increment: ++number
        resultValue = ++number;
        System.out.println("After pre-increment (++number):");
        System.out.println("Current value of number: " + number);
        System.out.println("Result of the operation: " + resultValue);
        
        // Pre-decrement: --number
        resultValue = --number;
        System.out.println("\nAfter pre-decrement (--number):");
        System.out.println("Current value of number: " + number);
        System.out.println("Result of the operation: " + resultValue);
        
        System.out.println("\nExplanation: In the prefix form, the operator is placed before the operand.");
        System.out.println("The value of the operand is incremented or decremented first, and then the result is used in the expression.");
        
        // Reset number to user input value
        System.out.print("\nRe-enter the initial value for the variable: ");
        number = scan.nextInt();
        
        System.out.println("\nPostfix Operations: ");
        
        // Post-increment: number++
        resultValue = number++;
        System.out.println("After post-increment (number++):");
        System.out.println("Current value of number: " + number);
        System.out.println("Result of the operation: " + resultValue);
        
        // Post-decrement: number--
        resultValue = number--;
        System.out.println("\nAfter post-decrement (number--):");
        System.out.println("Current value of number: " + number);
        System.out.println("Result of the operation: " + resultValue);
        
        System.out.println("\nExplanation: In the postfix form, the operator is placed after the operand.");
        System.out.println("The value of the operand is used in the expression first, and then it is incremented or decremented.");
        
        scan.close();
    }
}