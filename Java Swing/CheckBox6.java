//ItemListener

package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class CheckBox6 extends JFrame {
    private Container c;
    private JCheckBox cb1,cb2,cb3,cb4;
    private JLabel L1;
    private JTextArea ta;
    private Font f;
    private ButtonGroup grp;
    
    CheckBox6()
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
        
        grp=new ButtonGroup();
        
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
        
        cb4=new JCheckBox("Python");
        cb4.setBounds(50,140,100,30);
        cb4.setBackground(Color.ORANGE);
        c.add(cb4);
        
        L1=new JLabel("You haven't selected anything.");
        L1.setBounds(50,170,300,30);
        c.add(L1);
        
        grp.add(cb1);
        grp.add(cb2);
        grp.add(cb3);
        grp.add(cb4);
        
        Handler handler = new Handler();
        cb1.addItemListener(handler);
        cb2.addItemListener(handler);
        cb3.addItemListener(handler);
        cb4.addItemListener(handler);
    }
    
    class Handler implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource()==cb1)
            {
                L1.setText("You have selected JAVA.");
                ta.setText("//Write Java code here:");
            }
            else if(e.getSource()==cb2)
            {
                L1.setText("You have selected C.");
                ta.setText("//Write C code here:");
            }
            else if(e.getSource()==cb3)
            {
                L1.setText("You have selected C++.");
                ta.setText("//Write Java code C++:");
            }
            else
            {
                L1.setText("You have selected Python.");
                ta.setText("//Write Java code Python:");
            }
        }
        
    }
 
    public static void main(String[] args) {
        CheckBox6 fr=new CheckBox6();
        fr.setVisible(true);
    }
}

