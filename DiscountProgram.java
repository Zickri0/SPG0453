/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountprogram;

import java.util.Scanner; // Import Scanner to read user input

public class DiscountProgram { // Main class
    public static void main(String[] args) { // Main body
        
        int choice; // Choice as int data types
        float price, quantity, discountRate = 0f, totalPrice, discountAmount, finalPrice; // set as float data types
        String itemName; // set as string data types
        Scanner baca = new Scanner(System.in); // Create scanner object called as baca
        
        System.out.print("Enter item name: "); // Requesting input from user
        itemName = baca.nextLine(); // Save input from user
        
        System.out.print("Enter price (RM): "); // Requesting input from user
        price = baca.nextFloat(); // Save input from user
        
        System.out.print("Enter quantity: "); // Requesting input from user
        quantity = baca.nextInt(); // Save input from user
        
        // Discount menu
        System.out.println("Choose discount rate:"); // Requesting input from user
        System.out.println("1. Yellow (5%)");
        System.out.println("2. Blue (10%)");
        System.out.println("3. Green (15%)");
        System.out.println("4. Red (20%)");
        
        System.out.print("Enter your choice (1-4): "); // Requesting input from user
        choice = baca.nextInt(); // Save input from user
        
        // Set discount rate
        switch (choice) {
            case 1: discountRate = 5; break;
            case 2: discountRate = 10; break;
            case 3: discountRate = 15; break;
            case 4: discountRate = 20; break;
            default: System.out.println("Invalid choice. No discount."); break;
        }

        // Calculate prices
        totalPrice = price * quantity; // Total price
        discountAmount = totalPrice * (discountRate / 100); // Discount amount
        finalPrice = totalPrice - discountAmount; // Final price

        // Output results
        System.out.println("\nOutput:");
        System.out.println("Item name: " + itemName);
        System.out.println("Price per Item: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after Discount: RM" + finalPrice);
    }
}