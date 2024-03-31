package javaswing;
import javax.swing.*;
import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//Level+Multilebel
//Background+Icon

public class Label extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel L1,passL1;
    
    Label()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        L1=new JLabel();
        L1.setText("Enter user Name:");
        L1.setBounds(50,20,150,50);
        c.add(L1);
        
        passL1=new JLabel("Enter Password:");
        passL1.setBounds(50,70,150,50);
        c.add(passL1);
        
        icon=new ImageIcon("tanvir.png");
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        Label fr=new Label(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
         
    }
}
