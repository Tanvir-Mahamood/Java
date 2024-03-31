package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListen extends JFrame {
    private Container c;
    
    WindowListen()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");
            }
        
        });
    }
    public static void main(String[] args) {
        WindowListen fr=new WindowListen();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,400,400);
        fr.setTitle(" ");
    }
}
