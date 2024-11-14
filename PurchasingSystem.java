/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purchasingsystem;
import java.util.Scanner; // Import Scanner to read user input

public class PurchasingSystem { // Main class
    public static void main(String[] args) { // Main method
        // Declare variables
        Scanner baca = new Scanner(System.in); // Create scanner object called as baca
        int itemNumber, quantity; // Item number & quantity as int data type
        float price = 0f, totalCost; // Price & totalCost as float
        String itemName = ""; // Item name as string data type

        // Display available items
        System.out.println("Available items:");
        System.out.println("1. Pen - RM1.50");
        System.out.println("2. Notebook - RM5.00");
        System.out.println("3. Pencil - RM0.80");
        System.out.println("4. Exit");

        // Get user input for item selection
        System.out.print("Please enter the number of the item you want to purchase: "); 
        itemNumber = baca.nextInt(); // Save input from user

        // Process the item selection using switch case
        switch (itemNumber) {
            case 1:
                itemName = "Pen";
                price = 1.50f; break;
            case 2:
                itemName = "Notebook";
                price = 5.00f; break;
            case 3:
                itemName = "Pencil";
                price = 0.80f; break;
            case 4:
                System.out.println("Exiting.");
                System.exit(0); break;
            default:
                System.out.println("Invalid.");
                return;
        }

        // Get quantity from user
        System.out.print("Enter the quantity of item: "); 
        quantity = baca.nextInt(); // Save input from user

        // Calculate total cost
        totalCost = price * quantity; // Total cost calculation

        // Display the total cost
        System.out.printf("Total cost: RM%.2f\n", totalCost);
    }
}