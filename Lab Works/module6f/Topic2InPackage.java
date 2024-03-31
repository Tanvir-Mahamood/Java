package module6f;
import java.util.Scanner;

public class Topic2InPackage {
    public static void main(String[] args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x=in.nextInt();
        y=in.nextInt();
        System.out.println(new Topic2InClass().sum(x,y));
    }
}
/*
private class sum(int x,int y)
{
    return (x+y);
}


*/
