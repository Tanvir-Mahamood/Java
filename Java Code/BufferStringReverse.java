package basicjava;
//import java.util.Scanner;
import java.util.*;

public class BufferStringReverse {
    public static void main(String args[])
    {
        String s1;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter a strring");
        s1=in.nextLine();
        
        StringBuffer s2=new StringBuffer(s1);
        
        s2.reverse();
        
        System.out.println("reverse:"+s2);
    }
}
