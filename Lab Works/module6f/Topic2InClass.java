package module6f;
import java.util.Scanner;

public class Topic2InClass {
    public static void main(String[] args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x=in.nextInt();
        y=in.nextInt();
        System.out.println("Summation within class:"+sum(x,y));
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
}
