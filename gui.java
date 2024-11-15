/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication53;

import java.awt.*;
import javax.swing.*;

public class JavaApplication53 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zickri");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font("Arial", Font.BOLD, 24));
                g.drawString("There is two square and circle", 10, 20);

                g.setColor(new Color(150, 75, 0));
                g.fillOval(300, 50, 100, 100);
                
                g.setColor(new Color(255, 255, 255));
                g.fillOval(330, 80, 40, 40);
                
                // Square
                g.setColor(new Color(150, 75, 0));
                g.fillRect(150, 50, 100, 100);
                
                g.setColor(new Color(150, 75, 0));
                g.fillRect(0, 50, 100, 100);                

                //Square in Square
                g.setColor(new Color(255, 255, 255));
                g.fillRect(180, 80, 40, 40);
                
                g.setColor(new Color(255, 255, 255));
                g.fillRect(30, 80, 40, 40);

                //Grass
                g.setColor(new Color(19, 109, 21));
                g.fillRect(0, 150, 400, 200);
            }
        };
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
