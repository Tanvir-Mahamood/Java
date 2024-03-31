package javaswing;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//Inheritance

public class FrameIcon extends JFrame {
    private ImageIcon icon;
    FrameIcon()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        //ImageIcon icon=new ImageIcon();
        //icon=new ImageIcon(getClass().getResource("tanvir.png"));
        icon=new ImageIcon("tanvir.png");
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        FrameIcon fr=new FrameIcon(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Frame");
         
    }
}
