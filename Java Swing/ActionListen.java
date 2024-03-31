package javaswing;
/*import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//2 ActionListener handeling 2 JText

public class ActionListen extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    
    ActionListen()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        tf1=new JTextField();
        tf1.setBounds(50,50,150,50);
        c.add(tf1);
        
        tf2=new JTextField();
        tf2.setBounds(50,110,150,50);
        c.add(tf2);
        
        tf1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s=tf1.getText();
                if(s.isEmpty()) JOptionPane.showMessageDialog(null, "Enter something.");
                else JOptionPane.showMessageDialog(null, "tf1= "+s);
            }
        
        });
        
        tf2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s2=tf1.getText();
                if(s2.isEmpty()) JOptionPane.showMessageDialog(null, "Enter something.");
                else JOptionPane.showMessageDialog(null, "tf2= "+s2);
            }
        
        });
    }
    
    public static void main(String[] args) {
        ActionListen fr=new ActionListen(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Action Listener");
    }
}
