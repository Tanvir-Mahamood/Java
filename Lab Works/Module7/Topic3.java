package Module7;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Topic3 extends JFrame {
    private Container c;
    private JButton btn;
    private JTextField tf;
    private JLabel L1,L2,L3;
    
    Topic3()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        L1=new JLabel();
        L1.setText("Input $");
        L1.setBounds(50,50,80,30);
        c.add(L1);
        
        tf=new JTextField();
        tf.setBounds(50,80,80,30);
        c.add(tf);
        
        L3=new JLabel();
        L3.setText("Tk");
        L3.setBounds(270,80,80,30);
        c.add(L3);
        
        L2=new JLabel();
        L2.setBounds(290,80,80,30);
        c.add(L2);
        
        btn=new JButton();
        btn.setText("Convert");
        btn.setBounds(150,230,100,40);
        c.add(btn);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String input=tf.getText();
                int dec=Integer.parseInt(input);
                dec=dec*103;
                String output=Integer.toString(dec);
                L2.setText(output);
            }
        
        });
    }
    public static void main(String[] args) {
        Topic3 fr=new Topic3();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,400,400);
        fr.setTitle("Money Changer");
    }
}
