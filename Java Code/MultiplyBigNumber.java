package basicjava;
import java.util.Scanner;
import java.math.BigInteger;

public class MultiplyBigNumber {
    public static void main(String args[])
    {
        String num1,num2;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter first large number:");
        num1=in.nextLine();
                
        System.out.println("Enter second large number:");
        num2=in.nextLine();
        
        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;
        sum=first.multiply(second);
        System.out.println(sum);
    }
}
