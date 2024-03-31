package javaswing;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Card_Layout extends JFrame implements ActionListener{
    private Container c;
    private CardLayout cl;
    private JButton btn1,btn2,btn3;
    
    Card_Layout()
    {
        c=this.getContentPane();
        cl=new CardLayout(10,10);
        c.setLayout(cl);
        c.setBackground(Color.LIGHT_GRAY);
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        
        c.add(btn1,"first");
        c.add(btn2,"second");
        c.add(btn3,"third");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        cl.next(c);
        //cl.show(c,"third");
    }
    public static void main(String[] args) {
        Card_Layout fr=new Card_Layout();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,400,400);
        fr.setTitle("Card Layout");
    }
}

