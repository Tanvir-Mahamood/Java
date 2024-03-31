package javaswing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//Label+MultiLabel+Font
//Icon+Background

public class Label2 extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel L1,passL1;
    private Font f;
    
    Label2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        //keep font before label
        f=new Font("Aarial",Font.BOLD,14);
        
        L1=new JLabel();
        L1.setText("Enter user Name:");
        L1.setBounds(50,20,150,50);
        L1.setFont(f);
        c.add(L1);
        
        passL1=new JLabel("Enter Password:");
        passL1.setBounds(50,70,150,50);
        passL1.setFont(f);
        c.add(passL1);
        
        icon=new ImageIcon("tanvir.png");
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        Label2 fr=new Label2(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
         
    }
}
