package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//Inheritance

public class FrameBG extends JFrame {
    private ImageIcon icon;
    private Container c;
    FrameBG()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setBackground(Color.RED);
        
        icon=new ImageIcon("tanvir.png");
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        FrameBG fr=new FrameBG(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
         
    }
}
