/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagemarks;

public class Average {

    public static double calculateAverage(Student student) {
        double sum = 0;
        for (double mark : student.getMarks()) {
            sum += mark;
        }
        return sum / student.getMarks().length;
    }

    public static double findHighestAverage(Student... students) {

        double highestAverage = calculateAverage(students[0]);

        for (Student student : students) {
            double average = calculateAverage(student);
            highestAverage = Math.max(highestAverage, average);
        }

        return highestAverage;
    }
}
