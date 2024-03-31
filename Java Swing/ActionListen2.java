package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//2 ActionListener handeling 2 JText

public class ActionListen2 extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
       
    ActionListen2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        tf1=new JTextField();
        tf1.setBounds(50,50,150,50);
        c.add(tf1);
        
        tf2=new JTextField();
        tf2.setBounds(50,110,150,50);
        c.add(tf2);
        
        /*Handler hand=new Handeler();
        tf1.addActionListener(hand);
        tf2.addActionListener(hand);*/
    }
    
    class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
            {
                String s=tf1.getText();
                if(s.isEmpty()) JOptionPane.showMessageDialog(null, "Enter something.");
                else JOptionPane.showMessageDialog(null, "tf1= "+s);
            }
    }
    
    public static void main(String[] args) {
        ActionListen2 fr=new ActionListen2(); 
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(200,50,400,300);
        fr.setTitle("Action Listener");
    }
}
