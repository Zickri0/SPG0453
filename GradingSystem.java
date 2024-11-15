/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grading.system;

import javax.swing.JOptionPane; //import JOptionPane
import java.util.Scanner; //import scanner

public class GradingSystem {
    public static void main(String[] args) { //main body
        Scanner Baca = new Scanner(System.in);
        
        // Dapatkan jumlah pelajar
        int students = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students:"));
        int[] marks = new int[students];
        char[] grades = new char[students];

        // Masukkan markah untuk setiap pelajar
        for (int i = 0; i < students; i++) {
            int mark;
            do {
                // User masukkan markah bagi setiap pelajar
                mark = Integer.parseInt(JOptionPane.showInputDialog("Enter marks for student " + (i + 1) + " (0-100):"));
                if (mark < 0 || mark > 100) {
                    //  mesej error
                    JOptionPane.showMessageDialog(null, "Please enter a valid mark between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            marks[i] = mark;
            grades[i] = stuGrade(mark); // Tentukan gred untuk markah
        }

        // Kira pengagihan gred
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
        for (char grade : grades) {
            switch (grade) {
                case 'A': gradeA++; break;
                case 'B': gradeB++; break;
                case 'C': gradeC++; break;
                case 'D': gradeD++; break;
                case 'F': gradeF++; break;
            }
        }

        // Kira bilangan pelajar yang lulus dan gagal
        int pass = gradeA + gradeB + gradeC + gradeD;
        int fail = gradeF;

        // Display keputusan
        display(gradeA, gradeB, gradeC, gradeD, gradeF, pass, fail);

        // Continue or Exit
        System.out.println("\n\nDo you want to continue? (yes/no)");
        String response = Baca.next();
        if (response.equalsIgnoreCase("yes")) {
            main(args); // Loop program
        } else {
            System.out.println("Exiting the program.");
        }
    }

    // Greding bagi setiap markah
    public static char stuGrade(int marks) {
        if (marks >= 80) return 'A';
        else if (marks >= 65) return 'B';
        else if (marks >= 50) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    // Display untuk keputusan
    public static void display(int gradeA, int gradeB, int gradeC, int gradeD, int gradeF, int pass, int fail) {
        System.out.println("Number of students with grade A: " + gradeA);
        System.out.println("Number of students with grade B: " + gradeB);
        System.out.println("Number of students with grade C: " + gradeC);
        System.out.println("Number of students with grade D: " + gradeD);
        System.out.println("Number of students with grade F: " + gradeF);
        System.out.println("\n\nNumber of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);

        // Paparkan mesej untuk instructor
        if (pass > fail) {
            System.out.println("\n\nBonus to instructor");
        } else {
            System.out.println("\n\nNo bonus to instructor");
        }
    }
}
