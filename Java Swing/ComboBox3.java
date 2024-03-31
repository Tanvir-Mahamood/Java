package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox3 extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLanguage={"C","C++","JAVA","Python"};
    private JLabel l1;
    private JButton btn;
    
    ComboBox3()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        cb=new JComboBox(proLanguage);
        cb.setBounds(50,50,100,50);
        cb.setEditable(true);
        cb.addItem("C#");
        c.add(cb);
        
        btn=new JButton("Show");
        btn.setBounds(52, 250, 80, 50);
        c.add(btn);
        
        l1=new JLabel();
        l1.setBounds(160, 50, 200,50);
        c.add(l1);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=cb.getSelectedItem().toString();
                l1.setText("You have selected: "+s);
            }
        });
    }
    
    public static void main(String[] args) {
        ComboBox3 fr=new ComboBox3();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,150,500,600);
        fr.setTitle(" ");
    }
}

