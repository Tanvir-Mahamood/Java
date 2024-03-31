package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class RadioButton extends JFrame {
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup grp;
    private Font f;
    
    RadioButton()
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
        male.setSelected(true); //Initially Male is selected
        male.setBackground(Color.ORANGE);
        male.setFont(f);
        c.add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setEnabled(false);
        female.setBackground(Color.ORANGE);
        female.setFont(f);
        c.add(female);
        
        grp.add(male);
        grp.add(female);
    }
    
    public static void main(String[] args) {
        RadioButton fr=new RadioButton();
        fr.setVisible(true);
    }
}
