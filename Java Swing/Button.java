package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame {
    private Container c;
    private JButton btn1,btn2;
    
    
    Button()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        btn1=new JButton("Submit");
        btn1.setBounds(100,50,100,50);
        c.add(btn1);
        
        btn2=new JButton("Clear");
        btn2.setBounds(210,50,100,50);
        c.add(btn2);
    }
    
    public static void main(String[] args) {
        Button fr=new Button(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Button");
    }
}
