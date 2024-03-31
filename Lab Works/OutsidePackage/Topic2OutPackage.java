package OutsidePackage;

import module6f.*;
import java.util.Scanner;

public class Topic2OutPackage {
    public static void main(String[] args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x=in.nextInt();
        y=in.nextInt();
        System.out.println("Summation from outside package: "+new Topic2InClass().sum(x,y));
    }
}
