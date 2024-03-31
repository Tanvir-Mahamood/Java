package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//

public class MultiplicationTable extends JFrame {
    private Container c;
    private JLabel imgL,tL;
    private JTextArea ta;
    private JTextField tf;
    private JButton clr;
    private ImageIcon img;
    private Font f;
    private Cursor cur;
    
    MultiplicationTable()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f=new Font("Arial",Font.ITALIC,18);
        cur=new Cursor(Cursor.HAND_CURSOR);
        
        img=new ImageIcon("Circuit.jpg");
        imgL=new JLabel(img);
        imgL.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
        c.add(imgL);
        
        tL=new JLabel("Enter any Number:");
        tL.setBounds(20,img.getIconHeight()+15,250,50);
        tL.setFont(f);
        tL.setForeground(Color.red);
        c.add(tL);
        
        tf=new JTextField();
        tf.setBounds(230,img.getIconHeight()+15,90,50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.GREEN);
        tf.setFont(f);
        c.add(tf);
        
        clr=new JButton("Clear");
        clr.setBounds(230,250,90,50);
        clr.setBackground(Color.CYAN);
        clr.setCursor(cur);
        c.add(clr);
        
        ta=new JTextArea();
        ta.setBounds(20,350,300,300);
        ta.setBackground(Color.LIGHT_GRAY);
        c.add(ta);
        
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(""); //Textrea will be cleared in every Execution
                String value=tf.getText();
                if(value.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "You did not entered any value.");
                }
                else
                {
                    int num=Integer.parseInt(tf.getText());
                
                    //Mathematical Model
                    for(int i=1;i<=10;i++)
                    {
                        int result=num*i;
                    
                        String r=String.valueOf(result);
                        String n=String.valueOf(num);
                        String incr=String.valueOf(i);
                    
                        ta.append(n+" X "+incr+" = "+r+"\n");
                    }
                }
            }
        });
        
        clr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                ta.setText("");
            }
        });
    }
    
    public static void main(String[] args) {
        MultiplicationTable fr=new MultiplicationTable();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(300,20,360,700);
        fr.setTitle("Multiplication");
        
    }
}
