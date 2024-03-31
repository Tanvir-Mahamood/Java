package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class CheckBox extends JFrame {
    private Container c;
    private JCheckBox cb1,cb2,cb3;
    
    CheckBox()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,400);
        this.setTitle("Check Box");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        cb1=new JCheckBox("Java");
        cb1.setBounds(50,100,100,30);
        cb1.setBackground(Color.ORANGE);
        c.add(cb1);
        
        cb2=new JCheckBox("C");
        cb2.setBounds(50,130,100,30);
        cb2.setBackground(Color.ORANGE);
        c.add(cb2);
        
        cb3=new JCheckBox("C++");
        cb3.setBounds(50,160,100,30);
        cb3.setBackground(Color.ORANGE);
        c.add(cb3);
    }
    
    public static void main(String[] args) {
        CheckBox fr=new CheckBox();
        fr.setVisible(true);
    }
}
