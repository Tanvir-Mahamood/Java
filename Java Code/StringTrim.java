package basicjava;
import java.util.Scanner;

public class StringTrim {
    public static void main(String args[])
    {
        String s1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=in.nextLine();
        System.out.println(s1.trim());
        
    }
}
