package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_Manager extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BorderLayout bLayout;
    
    Layout_Manager()
    {
        c=this.getContentPane();
        bLayout=new BorderLayout(10,5);
        c.setLayout(bLayout);
        c.setBackground(Color.LIGHT_GRAY);
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        
        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.WEST);
        c.add(btn3,BorderLayout.CENTER);
        c.add(btn4,BorderLayout.EAST);
        c.add(btn5,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        Layout_Manager fr=new Layout_Manager();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,400,400);
        fr.setTitle(" ");
    }
}
