package basicjava;
import java.util.Scanner;

public class StringIndexOf {
    public static void main(String args[])
    {
        String s1,s2;
        int index1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=in.nextLine();
        System.out.println("Enter a string for searching index: ");
        s2=in.nextLine();
        index1=s1.indexOf(s2);
        System.out.println(index1);
    }
    
}
