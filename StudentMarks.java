/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        
        float test1, test2, averageMark;
        String name, id, subject;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        name = scan.nextLine();
 
        System.out.print("Enter student's ID: ");
        id = scan.nextLine();
        
        System.out.print("Enter subject: ");
        subject = scan.nextLine();
        
        System.out.print("Enter marks for Test 1 (/100): ");
        test1 = scan.nextFloat();
        
        System.out.print("Enter marks for Test 2 (/100): ");
        test2 = scan.nextFloat();
        
        // Calculate average mark
        averageMark = (test1 + test2) / 2;
        
        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.printf("Average mark: %.2f", averageMark);
    }
}