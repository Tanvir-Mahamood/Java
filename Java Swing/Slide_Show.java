package javaswing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slide_Show extends JFrame implements ActionListener{
    private Container c;
    private JPanel pnl;
    private JButton btn1,btn2;
    private ImageIcon icon;
    private JLabel l1;
    private CardLayout card;
    
    public void showImage()
    {
        String[] imageName={"IMG_20230307_104736.jpg","IMG_20230307_104744.jpg","IMG_20230307_105330.jpg"};
        for(String n:imageName)
        {
            icon=new ImageIcon("src/Images/"+n);
            
            //Resizing Image
            Image img=icon.getImage();
            Image newImage=img.getScaledInstance(pnl.getWidth(), pnl.getHeight(), Image.SCALE_SMOOTH);
            icon=new ImageIcon(newImage);
            
            l1=new JLabel(icon);
            pnl.add(l1);
        }
    }
    
    Slide_Show()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        card=new CardLayout();
        
        
        pnl=new JPanel(card);
        pnl.setBounds(10, 10, 560, 380);
        c.add(pnl);
        
        btn1=new JButton("Previous");
        btn1.setBounds(10, 400, 100, 50);
        c.add(btn1);
        
        btn2=new JButton("Next");
        btn2.setBounds(470, 400, 100, 50);
        c.add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        showImage();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1) card.previous(pnl);
        else card.next(pnl);
    }
    
    public static void main(String[] args) {
        Slide_Show fr=new Slide_Show();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,600,500);
        fr.setTitle("Slide Show");
    }
}
