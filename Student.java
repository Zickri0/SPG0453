/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagemarks;

public class Student {
    private double[] marks; // Array to store the marks of the student

    // Constructor to initialize the marks
    public Student(double... marks) {
        this.marks = marks;
    }

    // Method to get the marks of the student
    public double[] getMarks() {
        return marks;
    }
}
