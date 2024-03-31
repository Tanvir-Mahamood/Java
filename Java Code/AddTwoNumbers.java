package basicjava;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String args[])
    {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number for addition:");
        x=in.nextInt();
        y=in.nextInt();
        z=x+y;
        System.out.println(z);
    }
}
