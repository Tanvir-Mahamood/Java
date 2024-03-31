package javaswing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
//Font+Foreground/Background+TextAlignment

public class TextField2 extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    
    TextField2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        f=new Font("Arial",Font.ITALIC+Font.BOLD,14);
        
        tf1=new JTextField();
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f);
        tf1.setForeground(Color.YELLOW);
        tf1.setBackground(Color.GREEN);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        tf2=new JTextField();
        tf2.setBounds(50,110,200,50);
        c.add(tf2);
    }
    
    public static void main(String[] args) {
        TextField2 fr=new TextField2(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
    }
}
