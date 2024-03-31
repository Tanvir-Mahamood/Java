package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LoginNewFrame extends JFrame {
    private Container c;
    private JLabel L1;
    private JButton btn;
    
    LoginNewFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,420,350);
        this.setTitle("New Frame");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        L1=new JLabel("Welcome to Department of CSE, RUET");
        L1.setBounds(50,50,250,50);
        c.add(L1);
        
        btn=new JButton("Back");
        btn.setBounds(50, 150, 70, 50);
        c.add(btn);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                LoginFrame2 frame= new LoginFrame2();
                frame.setVisible(true);
            }
        });
    }
    
    public static void main(String[] args) {
        LoginNewFrame fr=new LoginNewFrame();
        fr.setVisible(true);
    }
}
