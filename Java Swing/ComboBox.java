package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLanguage={"C","C++","JAVA","Python"};
    
    ComboBox()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        cb=new JComboBox(proLanguage);
        cb.setBounds(50,50,100,50);
        cb.setEditable(true);
        //cb.setSelectedIndex(2);
        //cb.setSelectedItem("JAVA");
        cb.addItem("C#");
        cb.removeItem("C#");
        //cb.removeItemAt(0);
        //cb.removeAllItems();
        c.add(cb);
        
        //Methods
        System.out.println("Total item="+cb.getItemCount());
        
    }
    
    public static void main(String[] args) {
        ComboBox fr=new ComboBox();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,150,500,600);
        fr.setTitle(" ");
    }
}

