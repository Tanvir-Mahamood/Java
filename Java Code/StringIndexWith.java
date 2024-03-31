package basicjava;
import java.util.Scanner;
public class StringIndexWith {
    public static void main(String args[])
    {
        String s1,s2;
        int index;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a strring");
        s1=in.nextLine();
        System.out.println("Enter a substring for search:");
        s2=in.nextLine();
        index=s1.indexOf(s2);
        System.out.println("Index= "+index);
    }
}
