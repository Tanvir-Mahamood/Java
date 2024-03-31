package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//Inserting Image
//Icon+Background

public class Label4 extends JFrame {
    private ImageIcon icon,img;
    private Container c;
    private JLabel imgL;
    
    Label4()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        img=new ImageIcon("Circuit.jpg");
        imgL=new JLabel(img);
        //imgL.setBounds(50,30,150,200);
        imgL.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
        c.add(imgL);
        
        icon=new ImageIcon("tanvir.png");
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        Label4 fr=new Label4(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,850,500);
        fr.setTitle("Frame");
         
    }
}
