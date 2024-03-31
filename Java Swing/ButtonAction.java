package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Clear a text using button

public class ButtonAction extends JFrame {
    private Container c;
    private JButton btn1,btn2;
    private JTextField tf;
    
    ButtonAction()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        /*btn1=new JButton("Submit");
        btn1.setBounds(100,50,100,50);
        c.add(btn1);*/
        
        tf=new JTextField();
        tf.setBounds(50,10,150,50);
        c.add(tf);
        
        btn2=new JButton("Clear");
        btn2.setBounds(50,80,150,50);
        c.add(btn2);
        
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("");
            }
        
        });
        
    }
    
    public static void main(String[] args) {
        ButtonAction fr=new ButtonAction(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Button");
    }
}
