package javaswing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
//Font+ Foreground/Background

public class PasswordField2 extends JFrame {
    private Container c;
    private Font f;
    private JPasswordField pf;
    
    
    PasswordField2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        f=new Font("Arial",Font.BOLD,18);
                
        pf=new JPasswordField();
        pf.setEchoChar('*');
        pf.setForeground(Color.GREEN);
        pf.setBackground(Color.YELLOW);
        pf.setFont(f);
        pf.setBounds(50,20,150,50);
        c.add(pf);
    }
    
    public static void main(String[] args) {
        PasswordField2 fr=new PasswordField2(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Password");
    }
}
