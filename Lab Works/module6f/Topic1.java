package module6f;
import java.util.Scanner;
public class Topic1 {
    public static void main(String[] args)
    {
        System.out.println("AAbdul Karim Sarder");
        System.out.println("Tlaimari,Rajshahi");
        
        int x,y;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter two values:");
        x=in.nextInt();
        y=in.nextInt();
        
        if(x>y)
        {
            System.out.println("Largest="+x);
        }
        else if(x<y)
        {
            System.out.println("Largest="+y);
        }
        else
        {
            System.out.println("Both are same.");
        }
        
        int i,sum=0,largest=0,lowest;
        float ave;
        
        int arr[]=new int[10];
        System.out.println("Enter 10 numbers:");
        for(i=0;i<10;i++)
        {
            arr[i]=in.nextInt();
            sum+=arr[i];
            if(arr[i]>largest) largest=arr[i];
        }
        lowest=arr[0];
        for(i=1;i<10;i++)
        {
            if(lowest>arr[i]) lowest=arr[i];
        }
        ave=(float)sum/10;
        System.out.println("Largest element="+largest);
        System.out.println("Lowest element="+lowest);
        System.out.println("AAverage="+ave);
    }
}
