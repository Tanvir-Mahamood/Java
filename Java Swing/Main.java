//Multiplication Table
package javaswing;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable fr=new MultiplicationTable();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(300,20,360,700);
        fr.setTitle("Multiplication");
    }
}
