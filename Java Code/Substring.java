package basicjava;
import java.util.Scanner;
public class Substring {
    public static void main(String args[])
    {
        String s1,sub="";
        int i,c,len;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a strring");
        s1=in.nextLine();
        len=s1.length();
        System.out.println("Substrings are:");
        
        for(c=0;c<s1.length();c++)
        {
            for(i=c+1;i<=s1.length();i++)
            {
                System.out.println(s1.substring(c,i));
            }
        }
    }
}
