package javaswing;
import javax.swing.JFrame;
//Inheritance

public class FrameDemo3 extends JFrame {
    FrameDemo3()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,50,400,300);
        setTitle("Frame");
    }
    
    
    public static void main(String[] args) {
        FrameDemo3 fr=new FrameDemo3(); 
        fr.setVisible(true);
         
    }
}
