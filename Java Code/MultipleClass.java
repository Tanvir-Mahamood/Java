package basicjava;

public class MultipleClass {
    MultipleClass() {System.out.println("Constructor of class1.");}
    
    public static void main(String args[])
    {
        MultipleClass ob1=new MultipleClass();
        Second ob2=new Second();
        
        ob1.method_1();
        ob2.method_2();
    }
    void method_1()
    {
        System.out.println("method of class-1 is called");
    }
}

class Second
{
    Second() {System.out.println("Constructor of class2");}
    
    void method_2()
    {
        System.out.println("method of class-2 is called");
    }
}
