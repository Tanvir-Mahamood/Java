package basicjava;
import java.util.Scanner;
public class StringEndWith {
    public static void main(String args[])
    {
        String s1,s2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=in.nextLine();
        System.out.println("Enter end of a string");
        s2=in.nextLine();

        System.out.println(s1.endsWith(s2));
    }
}
