package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class CheckBox2 extends JFrame {
    private Container c;
    private JCheckBox cb1,cb2,cb3;
    private JLabel L1;
    private JTextArea ta;
    private Font f;
    
    CheckBox2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,600);
        this.setTitle("Check Box");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        f=new Font("Consolas",Font.BOLD,18);
        
        ta=new JTextArea();
        ta.setBounds(50,210,300,300);
        ta.setForeground(Color.WHITE);
        ta.setBackground(Color.BLACK);
        c.add(ta);
        
        cb1=new JCheckBox("Java");
        cb1.setBounds(50,50,100,30);
        cb1.setBackground(Color.ORANGE);
        c.add(cb1);
        
        cb2=new JCheckBox("C");
        cb2.setBounds(50,80,100,30);
        cb2.setBackground(Color.ORANGE);
        c.add(cb2);
        
        cb3=new JCheckBox("C++");
        cb3.setBounds(50,110,100,30);
        cb3.setBackground(Color.ORANGE);
        c.add(cb3);
        
        L1=new JLabel("You haven't selected anything.");
        L1.setBounds(50,150,300,30);
        c.add(L1);
        
        cb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText("You have selected JAVA.");
                ta.setText("//Write Java code here:");
            }
        });
        cb2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText("You have selected C.");
                ta.setText("//Write C code here:");
            }
        });
        cb3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText("You have selected C++.");
                ta.setText("//Write C++ code here:");
            }
        });
    }
    
    public static void main(String[] args) {
        CheckBox2 fr=new CheckBox2();
        fr.setVisible(true);
    }
}
