package javaswing;
import javax.swing.JOptionPane;
public class MessageDialog {
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"Wrong Password!");
        JOptionPane.showMessageDialog(null,"Wrong Password!","Warning",JOptionPane.ERROR_MESSAGE);
        
        /*JOptionPane.PLAIN_MESSAGE     -1
        JOptionPane.ERROR_MESSAGE        0
        JOptionPane.INFORMATION_MESSAGE  1
        JOptionPane.WARNING_MESSAGE      2
        JOptionPane.QUESTION_MESSAGE     3*/
    }
}
