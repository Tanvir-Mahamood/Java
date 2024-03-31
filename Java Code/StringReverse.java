package basicjava;
import java.util.Scanner;

public class StringReverse {
    public static void main(String args[])
    {
        String s1,s2="";
        int length,i;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter a strring");
        s1=in.nextLine();
        
        length=s1.length();
        for(i=length-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println("reverse:"+s2);
    }
}
