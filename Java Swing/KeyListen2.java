//Vowel Counter
package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KeyListen2 extends JFrame {
    private Container c;
    private JLabel L1,L2,aL,eL,iL,oL,uL;
    private JTextArea ta;
    private JScrollPane scroll;
    
    int totalVowel=0;
    int letter_a=0;
    int letter_e=0;
    int letter_i=0;
    int letter_o=0;
    int letter_u=0;
    
    KeyListen2()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        L1=new JLabel("Enter the text: ");
        L1.setBounds(10, 20, 100, 30);
        c.add(L1);
        
        ta=new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        scroll=new JScrollPane(ta);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);
        
        L2=new JLabel();
        L2.setBounds(110, 150, 150, 30);
        c.add(L2);
        
        aL=new JLabel();
        aL.setBounds(110, 190, 150, 30);
        c.add(aL);
        
        eL=new JLabel();
        eL.setBounds(110, 230, 150, 30);
        c.add(eL);
        
        iL=new JLabel();
        iL.setBounds(110, 270, 150, 30);
        c.add(iL);
        
        oL=new JLabel();
        oL.setBounds(110, 310, 150, 30);
        c.add(oL);
        
        uL=new JLabel();
        uL.setBounds(110, 350, 150, 30);
        c.add(uL);
        
        ta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {  }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getSource()==ta)
                {
                    if(e.VK_A==e.getKeyCode())
                    {
                        letter_a++;
                        totalVowel++;
                    }
                    if(e.VK_E==e.getKeyCode())
                    {
                        letter_e++;
                        totalVowel++;
                    }
                    if(e.VK_I==e.getKeyCode())
                    {
                        letter_i++;
                        totalVowel++;
                    }
                    if(e.VK_O==e.getKeyCode())
                    {
                        letter_o++;
                        totalVowel++;
                    }
                    if(e.VK_U==e.getKeyCode())
                    {
                        letter_u++;
                        totalVowel++;
                    }
                }
                L2.setText("Total number of Vowels: "+totalVowel);
                aL.setText("a="+letter_a);
                eL.setText("e="+letter_e);
                iL.setText("i="+letter_i);
                oL.setText("o="+letter_o);
                uL.setText("u="+letter_u);
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        
        });
    }
    public static void main(String[] args) {
        KeyListen2 fr=new KeyListen2();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(200,200,600,500);
        fr.setTitle(" ");
    }
}

