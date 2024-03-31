package basicjava;
import java.util.Scanner;
public class StringReplace {
    public static void main(String args[])
    {
        String s1,s2,s3;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=in.nextLine();
        System.out.println("Substring should be changed: ");
        s2=in.nextLine();
        System.out.println("New substring for replacement: ");
        s3=in.nextLine();

        String newstring=s1.replaceAll(s2, s3);
        System.out.println(newstring);
    }
}
