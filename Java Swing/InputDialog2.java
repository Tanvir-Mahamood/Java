package javaswing;
import javax.swing.JOptionPane;

public class InputDialog2 {
    public static void main(String[] args) {
        String f_name,l_name,name;
        //2 Parameter
        f_name=JOptionPane.showInputDialog("Enter first name: ", "Engineer ");
        //JOptionPane.showMessageDialog(null, "Welcome "+f_name);
        
        //4 Parameter
        l_name=JOptionPane.showInputDialog(null,"Enter last name: ","This is title",1);
        
        name=f_name+" "+l_name;
        //name=f_name.concat(l_name);
        JOptionPane.showMessageDialog(null, "Welcome "+name);
    }
}
