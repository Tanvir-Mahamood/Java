package basicjava;
import java.util.Scanner;
public class Swap2 {
    public static void main(String[] args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter X and Y:");
        x=in.nextInt();
        y=in.nextInt();
        
        System.out.println("Before swappinf\nx= "+x+"and y= "+y);
        
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("After swappinf\nx= "+x+"and y= "+y);
    }
}
