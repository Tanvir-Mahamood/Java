package javaswing;
import javax.swing.JFrame;
//Inheritance

public class FrameDemo2 extends JFrame {
    public static void main(String[] args) {
        FrameDemo2 fr=new FrameDemo2(); //Frame is created
        fr.setVisible(true);  //Frame is visibla
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame direct closed
        
        //fr.setSize(400,300); //Size is defined in pixel
        //fr.setLocationRelativeTo(null); //Bring the frame in centre
        //fr.setLocation(200, 50); //Frame is 200 pixel from left and 50 from top
        
        //setLocation()+setSize()=setBounds()
        fr.setBounds(200,50,400,300);
        
        fr.setTitle("Frame");
        fr.setResizable(false); //Not resizable
    }
}
