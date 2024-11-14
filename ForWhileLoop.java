/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forwhileloop;

public class ForWhileLoop {

    public static void main(String[] args) {
      System.out.println("Using 'for' loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Using 'while' loop
        System.out.println("\nUsing 'while' loop:");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Using 'do-while' loop
        System.out.println("\nUsing 'do-while' loop:");
        int k = 1;
        do {
            System.out.print(k);
            k++;
        } while (k <= 10);
    }
}
