package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Slider extends JFrame {
    private Container c;
    private JSlider sl;
    
    Slider()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        sl=new JSlider(0,20,0);
        sl.setBounds(100, 50, 300, 50);
        sl.setMinorTickSpacing(1);
        sl.setMajorTickSpacing(5);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        c.add(sl);
    }
    public static void main(String[] args) {
        Slider fr=new Slider();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,600,300);
        fr.setTitle(" ");
    }
}

