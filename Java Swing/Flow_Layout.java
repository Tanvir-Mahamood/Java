package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow_Layout extends JFrame {
    private Container c;
    private JButton btn[];
    private FlowLayout fl;
    
    Flow_Layout()
    {
        c=this.getContentPane();
        //fl=new FlowLayout();
        fl=new FlowLayout(FlowLayout.LEFT,10,15);
        c.setLayout(fl);
        c.setBackground(Color.LIGHT_GRAY);
        
        btn=new JButton[9];
        for(int i=0;i<9;i++)
        {
            btn[i]=new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args) {
        Flow_Layout fr=new Flow_Layout();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,350,300);
        fr.setTitle(" ");
    }
}
