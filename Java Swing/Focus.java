package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Focus extends JFrame {
    private Container c;
    private JButton btn;
    private JTextArea ta;
    
    Focus()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        btn=new JButton("Click");
        btn.setBounds(10, 50, 80, 50);
        c.add(btn);
        
        ta=new JTextArea();
        ta.setBounds(100, 30, 200, 200);
        c.add(ta);
        
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                ta.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                ta.setText("Focus Lost");
            }
        
        });
    }
    public static void main(String[] args) {
        Focus fr=new Focus();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,400,400);
        fr.setTitle(" ");
    }
}
