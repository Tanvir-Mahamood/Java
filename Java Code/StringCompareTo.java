package basicjava;
import java.util.Scanner;

public class StringCompareTo {
    public static void main(String args[])
    {
        String s1,s2;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter first strring");
        s1=in.nextLine();
        System.out.println("Enter second strring");
        s2=in.nextLine();
        //strcmt() in c++
        if(s1.compareTo(s2)>0)
            System.out.println("First string in greater that second");
        else if(s1.compareTo(s2)<0)
            System.out.println("Second string in greater that first");
        else
            System.out.println("The strings are same");
    }
}
