package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordField extends JFrame {
    private Container c;
    //private JTextField tf1,tf2;
    private JPasswordField pf;
    
    
    PasswordField()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
                
        pf=new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(50,20,150,50);
        c.add(pf);
    }
    
    public static void main(String[] args) {
        PasswordField fr=new PasswordField(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
    }
}
