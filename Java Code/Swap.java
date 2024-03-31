package basicjava;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args)
    {
        int x,y,temp;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter X and Y:");
        x=in.nextInt();
        y=in.nextInt();
        
        System.out.println("Before swappinf\nx= "+x+"and y= "+y);
        
        temp=x;
        x=y;
        y=temp;
        
        System.out.println("After swappinf\nx= "+x+"and y= "+y);
    }
}
