package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox2 extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLanguage={"C","C++","JAVA","Python"};
    private JLabel l1;
    
    ComboBox2()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        cb=new JComboBox(proLanguage);
        cb.setBounds(50,50,100,50);
        cb.setEditable(true);
        cb.addItem("C#");
        c.add(cb);
        
        l1=new JLabel();
        l1.setBounds(160, 50, 200,50);
        c.add(l1);
        
        cb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=cb.getSelectedItem().toString();
                l1.setText("You have selected: "+s);
            }
        });
    }
    
    public static void main(String[] args) {
        ComboBox2 fr=new ComboBox2();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,150,500,600);
        fr.setTitle(" ");
    }
}

