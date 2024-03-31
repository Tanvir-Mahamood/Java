package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mouse extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    
    Mouse()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        tf=new JTextField();
        tf.setBounds(20, 20, 150, 50);
        c.add(tf);
        
        ta=new JTextArea();
        ta.setBackground(Color.red);
        //ta.setBounds(10, 80, 300, 300);
        //c.add(ta);
        
        scroll=new JScrollPane(ta);
        scroll.setBounds(10, 80, 300, 300);
        c.add(scroll);
        
        tf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                ta.append("Mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.append("Mouse Released\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ta.append("Mouse entered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ta.append("Mouse Exited\n");
            }
        
        });
    }
    public static void main(String[] args) {
        Mouse fr=new Mouse();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,400,400);
        fr.setTitle("Mouse Listener");
    }
}