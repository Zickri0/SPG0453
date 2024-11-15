/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1,limit,next;
        
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Enter a number to display up to that number: ");
        limit = baca.nextInt(); // Get the upper limit from the user

        System.out.print("Fibonacci Series up to " + limit + ": ");
        
        if (limit < 0) {
            System.out.println("Please enter a positive number.");//enter positive num only
        } else if (limit == 0) {
            System.out.println(a); // If the limit is 0, only print 0
        } else {
            // Print the Fibonacci series until that number
            while (a <= limit) {
                System.out.print(a + " ");
                next = a + b; // Calculate the next Fibonacci number
                a = b; // Update a to b after add
                b = next; // Update b to 'next number'
            }
        }
        baca.close(); // Close the scanner
    }
}