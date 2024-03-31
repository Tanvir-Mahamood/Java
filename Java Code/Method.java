package basicjava;

public class Method {
    //constructor calling
    Method()
    {
        System.out.println("Constructor is called when object is created.");
    }
    
    //main function
    public static void main(String args[])
    {
        System.out.println("Inside main function.");
        StaticMethod();
        
        Method obj=new Method();
        obj.nonStaticMethod();
    }
    
    static void StaticMethod()
    {
        System.out.println("Static method can be called without creating object.");
    }
    
    void nonStaticMethod()
    {
        System.out.println("Object in needed for non-static method.");
    }
}
