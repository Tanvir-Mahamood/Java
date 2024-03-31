package javaswing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//Font+Foreground/Background+Cursor+Image

public class Button2 extends JFrame {
    private Container c;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cur;
    private ImageIcon img1,img2;
    
    Button2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        f=new Font("Arial",Font.BOLD,18);
        
        cur=new Cursor(Cursor.HAND_CURSOR);
        
        img1=new ImageIcon("LogIn.jpg");
        img2=new ImageIcon("ClearButton.png");
        
        btn1=new JButton(img1);
        btn1.setFont(f);
        btn1.setForeground(Color.GREEN);
        btn1.setBackground(Color.YELLOW);
        btn1.setCursor(cur);
        btn1.setBounds(100,50,img1.getIconWidth(),img1.getIconHeight());
        c.add(btn1);
        
        btn2=new JButton(img2);
        btn2.setFont(f);
        btn2.setForeground(Color.CYAN);
        btn2.setBackground(Color.darkGray);
        btn2.setCursor(cur);
        btn2.setBounds(150+img1.getIconWidth(),50,img2.getIconWidth(),img2.getIconHeight());
        c.add(btn2);
    }
    
    public static void main(String[] args) {
        Button2 fr=new Button2(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Button");
    }
}
