/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacciseries;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number up to which the Fibonacci series should be displayed: ");
        int limit = read.nextInt();
        read.close();

        if (limit < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        System.out.println("Fibonacci series up to " + limit + ":");
        int first = 0, second = 1;

        if (limit >= first) {
            System.out.print(first);
        }

        while (second <= limit) {
            System.out.print(", " + second);
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}

