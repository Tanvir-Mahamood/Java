package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    
    TextField()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
         
        tf1=new JTextField();
        tf1.setBounds(50,50,200,50);
        c.add(tf1);
        
        tf2=new JTextField();
        tf2.setBounds(50,110,200,50);
        c.add(tf2);
    }
    
    public static void main(String[] args) {
        TextField fr=new TextField(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
    }
}
