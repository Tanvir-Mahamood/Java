package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotion extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
   
    MouseMotion()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        ta=new JTextArea();
        ta.setBackground(Color.red);
        ta.setBounds(10, 20, 200, 200);
        c.add(ta);
        
        tf=new JTextField();
        tf.setBounds(220, 20, 150, 50);
        c.add(tf);
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Draged"+e.getX()+" "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse Moved"+e.getX()+" "+e.getY());
            }
        
        });
    }
    public static void main(String[] args) {
        MouseMotion fr=new MouseMotion();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,500,400);
        fr.setTitle("Mouse Listener");
    }
}