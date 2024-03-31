package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spiner extends JFrame implements ChangeListener{
    private Container c;
    private JSpinner sp;
    private JLabel l1;
    
    Spiner()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        SpinnerNumberModel value=new SpinnerNumberModel(10,0,30,1);
        
        sp=new JSpinner(value);
        sp.setBounds(100, 100, 70, 50);
        c.add(sp);
        
        l1=new JLabel();
        l1.setBounds(100, 200, 150, 50);
        c.add(l1);
        
        sp.addChangeListener(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        String number=sp.getValue().toString();
        int value=Integer.parseInt(number);
        //l1.setText(number);
        l1.setText("Current Value: "+value);
    }
    
    public static void main(String[] args) {
        Spiner fr=new Spiner();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,450,450);
        fr.setTitle(" ");
    }

}
