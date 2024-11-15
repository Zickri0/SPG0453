/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagemarks;
import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        // Create student objects with user input
        System.out.println("Enter marks for Student 1:");
        double[] marks1 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks1[i] = baca.nextDouble();
        }
        Student student1 = new Student(marks1);

        System.out.println("Enter marks for Student 2:");
        double[] marks2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks2[i] = baca.nextDouble();
        }
        Student student2 = new Student(marks2);

        System.out.println("Enter marks for Student 3:");
        double[] marks3 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks3[i] = baca.nextDouble();
        }
        Student student3 = new Student(marks3);

        // Calculate averages and display them using AverageCalculator class
        System.out.printf("\nStudent 1's Average: %.2f%n", Average.calculateAverage(student1));
        System.out.printf("Student 2's Average: %.2f%n", Average.calculateAverage(student2));
        System.out.printf("Student 3's Average: %.2f%n", Average.calculateAverage(student3));

        // Find and display the highest average using AverageCalculator class
        double highestAvg = Average.findHighestAverage(student1, student2, student3);
        System.out.printf("Highest Average is: %.2f%n", highestAvg);

        baca.close();
    }
}
