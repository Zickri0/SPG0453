/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        
        float weight, height, bmi;
        Scanner scan = new Scanner(System.in);
        
        // Input: User's weight and height
        System.out.print("Enter your weight (in kg): ");
        weight = scan.nextFloat();
        
        System.out.print("Enter your height (in m): ");
        height = scan.nextFloat();
        
        // Calculate BMI
        bmi = weight / (height * height);
        
        // Display the BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        scan.close();
    }
}