package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame {
    private Container c;
    private JLabel L1;
    private Font f;
    private JTable tbl;
    private JScrollPane scroll;
    
    private String[] cols={"ID","Name","GPA"};
    private String[][] rows={
        {"101","Anisul","3.94"},
        {"102","Tanvir","3.86"},
        {"103","Dipe","3.56"}
        };
    
    Table()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        f=new Font("Arial",Font.BOLD,22);
        
        L1=new JLabel("Student Details");
        L1.setFont(f);
        L1.setBounds(250, 20, 200, 50);
        c.add(L1);
        
        tbl=new JTable(rows,cols);
        //tbl.setEnabled(false);
        tbl.setSelectionBackground(Color.BLUE);
        
        scroll=new JScrollPane(tbl);
        scroll.setBounds(50, 80, 600, 150);
        c.add(scroll);
        
    }
    public static void main(String[] args) {
        Table fr=new Table();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(100,100,750,450);
        fr.setTitle(" ");
    }
}

