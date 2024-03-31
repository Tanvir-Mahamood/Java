package basicjava;
import java.util.Scanner;
public class ExceptionHandeling {
    public static void main(String args[])
    {
        int a,b,res;
        //float res;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number for division:");
        a=in.nextInt();
        b=in.nextInt();
        try
        {
            //res=(float)a/b;
            res=a/b;
            System.out.println("Division= "+res);
        }
        catch(ArithmeticException e)
                {
                    System.out.println("Error! Divided by 0.");
                }
    }
}
