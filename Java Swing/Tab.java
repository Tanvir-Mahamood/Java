package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tab extends JFrame {
    private Container c;
    private JTabbedPane tp;
    private JPanel pnl1,pnl2,pnl3;
    private JLabel l1,l2,l3;
    
    Tab()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        tp=new JTabbedPane();
        tp.setBounds(50, 50, 300, 300);
        c.add(tp);
        
        l1=new JLabel("This is panel 1");
        l2=new JLabel("This is panel 2");
        l3=new JLabel("This is panel 3");
        
        pnl1=new JPanel();
        pnl1.setBackground(Color.red);
        pnl1.add(l1);
        pnl2=new JPanel();
        pnl2.setBackground(Color.BLUE);
        pnl2.add(l2);
        pnl3=new JPanel();
        pnl3.setBackground(Color.ORANGE);
        pnl3.add(l3);
        
        tp.addTab("Home", pnl1);
        tp.addTab("Help", pnl2);
        tp.addTab("Edit", pnl3);
    }
    public static void main(String[] args) {
        Tab fr=new Tab();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,450,450);
        fr.setTitle(" ");
    }
}

