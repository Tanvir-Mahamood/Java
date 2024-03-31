package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
//Textrea+Font+Foreground/Background+LineWarp+WarpStyleWord+Scroll

public class TextArea2 extends JFrame {
    private Container c;
    private JTextArea ta; //For multiLine text
    private Font f;
    private JScrollPane scroll;
    
    TextArea2()
    {
       initComponents();
    }
    
    void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        f=new Font("Arial",Font.BOLD,18);
        
        ta=new JTextArea();
        //ta.setBounds(50,50,300,200);
        ta.setFont(f);
        ta.setForeground(Color.YELLOW);
        ta.setBackground(Color.PINK);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        //c.add(ta);
        
        scroll=new JScrollPane(ta);
        scroll.setBounds(50,50,300,200);
        c.add(scroll);
        
    }
    
    public static void main(String[] args) {
        TextArea2 fr=new TextArea2(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Text Area");
    }
}
