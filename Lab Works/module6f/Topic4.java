package module6f;

import java.util.Scanner;

public class Topic4 {
    private int x,y;
    private static int cnt=0;
    Scanner in=new Scanner(System.in);
    Topic4()
    {
        System.out.println("Constructor of obj1.Enter value of x and y:");
        x=in.nextInt();
        y=in.nextInt();
    }
    public static void main(String[] args) {
        Topic4 obj1=new Topic4();
        Static_method();
        obj1.NonStatic_method();
    }
    
    public static void Static_method()
    {
        cnt++;
        System.out.println("Static Method is called");
        System.out.println("Value of static variable=="+cnt);
    }
    
    public void NonStatic_method()
    {
        cnt++;
        System.out.println("Non-Static Method is called");
        System.out.println("Sum of x and y="+(x+y));
    }
}
