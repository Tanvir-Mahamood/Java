package javaswing;
import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args) {
        int choice=JOptionPane.showConfirmDialog(null, "Do you want to quit? ", "title", JOptionPane.YES_NO_OPTION);
        
        if(choice==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("you have clicked NO");
        }
    }
    
}
