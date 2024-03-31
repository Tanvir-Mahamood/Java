package basicjava;

public class EnhancedLoop {
    public static void main(String args[])
    {
        int primes[]={2,3,5,7,11,13,17};
        String language[]={"c","c++","java","python"};
        
        for(int t: primes) System.out.print(t+" ");
        System.out.print("\n ");
        for(String t: language) System.out.print(t+" ");
    }
}
