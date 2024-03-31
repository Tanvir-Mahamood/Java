package basicjava;
import java.util.Scanner;

public class StringFunction {
    public static void main(String args[])
    {
        String s1,s2,s3;
        int len;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=in.nextLine();
        
        len=s1.length(); //length of the string
        
        System.out.println("Enter a string for concatanation");
        s2=in.nextLine();
        System.out.println("Lenght= "+len);
        
        s3=s1.concat(s2);
        System.out.println("New string"+s3);
    }
}
