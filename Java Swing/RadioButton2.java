package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class RadioButton2 extends JFrame {
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    
    RadioButton2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);
        this.setTitle("Radio Button");
        
        grp=new ButtonGroup();
        f=new Font("Arial",Font.BOLD,18);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        male=new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setBackground(Color.ORANGE);
        male.setFont(f);
        c.add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setBackground(Color.ORANGE);
        female.setFont(f);
        c.add(female);
        
        grp.add(male);
        grp.add(female);
        
        ta=new JTextArea();
        ta.setBounds(20,110,300,200);
        c.add(ta);
        
        male.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                ta.append("He is a boy");
            }
        
        });
        female.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                ta.append("Damn,she is...");
            }
        
        });
        
    }
    
    public static void main(String[] args) {
        RadioButton2 fr=new RadioButton2();
        fr.setVisible(true);
    }
}
