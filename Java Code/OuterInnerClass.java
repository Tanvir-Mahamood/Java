package basicjava;
import java.awt.Point;
import java.util.Scanner;

public class OuterInnerClass {
    public static void main(String args[])
    {
        //Scanner in=new Scanner(System.in);
        Outer ob1=new Outer();
        Outer.Inner ob2=new Outer().new Inner();
        
        ob1.get_x();
        ob2.get_y();
        
        ob2.sum();
    }
}

class Outer
{
    Scanner in=new Scanner(System.in);
    
    private static int x;
    void get_x()
    {
        System.out.println("Enter x:");
        x=in.nextInt();
    }
    
    int ins_x()
    {
        return x;
    }
     
    class Inner
    {
        private int y;
        void get_y()
        {
            System.out.println("Enter y:");
            y=in.nextInt();
        }
        
        void sum()
        {
            System.out.println(x+y);
        }
    }
    
}
