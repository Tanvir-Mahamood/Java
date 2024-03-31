package javaswing;
import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String args[])
    {
        //1 Parameter
        String name;
        name=JOptionPane.showInputDialog("Enter your Name:");
        JOptionPane.showMessageDialog(null, "Welcome "+name.toUpperCase());
    }
}
