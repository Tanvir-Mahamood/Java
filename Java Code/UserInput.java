package basicjava;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        int a;
        float b;
        String s;
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter a string");
        s=in.nextLine();
        System.out.println("You have entered "+s);
        
        System.out.println("Enter an Integer");
        a=in.nextInt();
        System.out.println("You have entered "+a);
        
        System.out.println("Enter a float");
        b=in.nextFloat();
        System.out.println("You have entered "+b);
    }
}
