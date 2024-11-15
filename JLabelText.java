/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jlabeltext;

import java.awt.*;
//import java.awt.event*; 
import javax.swing.*;

public class JLabelText extends JFrame {
    private JLabel label1, label2;
    private JTextField textField1, TextA;
    private JTextArea Textbox1;
    private JButton plainButton, fancyButton, button1, button2;
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb2;
    private JComboBox Combobox;
    
    public JLabelText() {
        super("Acrid The Doggo");
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        label1 = new JLabel("This is Acrid");
        label1.setToolTipText("This is label1"); 
        container.add(label1);

        setSize(600, 1000);
        setVisible(true);
        
        Icon acrid = new ImageIcon("acrid-dog.gif");
        label2 = new JLabel("Acrid is a good dog", acrid,SwingConstants.LEFT);
        label2.setToolTipText("This is an animated acrid");
        container.add(label2);
        
        textField1 = new JTextField(10);
        textField1.setSize(50,50);
        container.add(textField1);
        
        plainButton = new JButton("Give");
        container.add(plainButton);
        
        Icon drink1 = new ImageIcon("GoatHoof.png");
        button1 = new JButton("Goat Hoof", drink1);
        button2 = new JButton("Gasoline");
        button1.setSize(100,40); button2.setSize(35,35);
        button1.setLocation(20,30); button2.setLocation(20,80);
        add(button1); add(button2);

        Icon bug1 = new ImageIcon("acrid.jpeg");
        fancyButton = new JButton("Pat Acrid", bug1);
        container.add(fancyButton);
        
        TextA = new JTextField ("Offer blood here");
        TextA.setSize(10,10);
        TextA.setLocation(20,20);
        TextA.setBackground(Color.red);
        TextA.setForeground(Color.BLACK);
        TextA.setFont(new Font("Courier",Font.ITALIC,15));
        add(TextA);
        
        Textbox1 = new JTextArea ("Shrine Cost $500");
        Textbox1.setSize(100,200);
        Textbox1.setLocation(20,20);
        Textbox1.setBackground(Color.BLACK);
        Textbox1.setForeground(Color.WHITE);
        Textbox1.setFont(new Font("Bookman",Font.TRUETYPE_FONT,16));
        add(Textbox1);
        
        b1 = new JRadioButton("Void Field");
        b2 = new JRadioButton("Wetland Aspect");
        b3 = new JRadioButton("Abandoned Aqueduct");
        b1.setBounds(20,20,200,50);
        b2.setBounds(20,70,200,50);
        b3.setBounds(20,110,200,50);
        container.add(b1);
        container.add(b2);
        container.add(b3);
        
        cb1 = new JCheckBox("Molten Perfurator");
        cb2 = new JCheckBox("Charge Perfurator");
        cb1.setBounds(20,20,200,50);
        cb2.setBounds(20,70,200,50);
        add(cb1);
        add(cb2);
        
        String names[]= {"White Soup","Green Soup","Red Soup"};
        Combobox = new JComboBox(names);
        Combobox.setMaximumRowCount(3);
        Combobox.setBounds(50,50,100,20);
        container.add(Combobox);
    }

    public static void main(String[] args) {
        JLabelText application = new JLabelText();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}