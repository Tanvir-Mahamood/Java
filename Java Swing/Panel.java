package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame {
    private Container c;
    private JPanel pnl1,pnl2;
    private JButton btn1,btn2,btn3;
    
    Panel()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        pnl1=new JPanel();
        pnl1.setBounds(100, 100, 250, 300);
        pnl1.setBackground(Color.red);
        c.add(pnl1);
        
        pnl2=new JPanel();
        pnl2.setBounds(355, 100, 250, 300);
        pnl2.setBackground(Color.GREEN);
        c.add(pnl2);
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        
        pnl1.add(btn1);
        pnl2.add(btn2);
        pnl1.add(btn3);
        
        
    }
    public static void main(String[] args) {
        Panel fr=new Panel();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,670,500);
        fr.setTitle(" ");
    }
}

