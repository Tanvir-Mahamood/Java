package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ToggleButton extends JFrame implements ActionListener {
    private Container c;
    private JToggleButton tb;
    private JLabel L1;
    
    ToggleButton()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        tb=new JToggleButton("Off");
        tb.setBounds(50, 50, 90, 90);
        c.add(tb);
        
        L1=new JLabel("Hello there");
        L1.setVisible(false);
        L1.setBounds(50, 150, 150, 50);
        c.add(L1);
        
        tb.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected())
        {
            tb.setText("On");
            L1.setVisible(true);
        }
        else
        {
            tb.setText("Off");
            L1.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        ToggleButton fr=new ToggleButton();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,400,300);
        fr.setTitle("Toggle button");
    }

}

