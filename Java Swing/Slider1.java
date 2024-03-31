package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider1 extends JFrame implements ChangeListener{
    private Container c;
    private JSlider reds,greens,blues;
    private JLabel redL,greenL,blueL,L1;
    private JTextField redtf,greentf,bluetf;
    private JPanel pnl;
    
    Slider1()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        redL=new JLabel("Red");
        redL.setBounds(50, 50, 80, 50);
        c.add(redL);
        
        reds=new JSlider(0,255,0);
        reds.setBounds(90, 50, 300, 50);
        c.add(reds);
        
        redtf=new JTextField();
        redtf.setHorizontalAlignment(JTextField.CENTER);
        redtf.setBounds(400, 50, 80, 50);
        c.add(redtf);
        
        greenL=new JLabel("Green");
        greenL.setBounds(50, 110, 80, 50);
        c.add(greenL);
        
        greens=new JSlider(0,255,0);
        greens.setBounds(90, 110, 300, 50);
        c.add(greens);
        
        greentf=new JTextField();
        greentf.setHorizontalAlignment(JTextField.CENTER);
        greentf.setBounds(400, 110, 80, 50);
        c.add(greentf);
        
        blueL=new JLabel("Blue");
        blueL.setBounds(50, 170, 80, 50);
        c.add(blueL);
        
        blues=new JSlider(0,255,0);
        blues.setBounds(90, 170, 300, 50);
        c.add(blues);
        
        bluetf=new JTextField();
        bluetf.setHorizontalAlignment(JTextField.CENTER);
        bluetf.setBounds(400, 170, 80, 50);
        c.add(bluetf);
        
        pnl=new JPanel();
        pnl.setBackground(Color.red);
        pnl.setBounds(550, 50, 200, 160);
        c.add(pnl);
        
        L1=new JLabel("Preview");
        L1.setBounds(630, 200, 100, 50);
        c.add(L1);
        
        reds.addChangeListener(this);
        greens.addChangeListener(this);
        blues.addChangeListener(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        int redV,greenV,blueV;
        
        redV=reds.getValue();
        greenV=greens.getValue();
        blueV=blues.getValue();
        
        redtf.setText(""+redV);
        greentf.setText(""+greenV);
        bluetf.setText(""+blueV);
        
        Color clor=new Color(redV,greenV,blueV);
        pnl.setBackground(clor);
    }
    
    public static void main(String[] args) {
        Slider1 fr=new Slider1();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,800,300);
        fr.setTitle(" ");
    }

}

