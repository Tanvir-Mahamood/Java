package basicjava;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String args[])
    {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three number for addition:");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        
        if(x>y && x>z) System.out.println("First number is large.");
        else if(y>y && y>z) System.out.println("Second number is large.");
        else if(z>y && z>x) System.out.println("Third number is large.");
        else System.out.println("The numbers are not distinct.");
    }
}
