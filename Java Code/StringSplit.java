package basicjava;
import java.util.Scanner;

public class StringSplit {
    public static void main(String args[])
    {
        String s1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s1=in.nextLine();
        
        //String words[]=s1.split("\\s"); //split by white space
        //String words[]=s1.split("d"); //split by character
        String words[]=s1.split("bc"); //split by string
        
        for(String w:words)
        {
            System.out.println(w);
        }
    }
}
