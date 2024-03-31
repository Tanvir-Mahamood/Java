package basicjava;

public class ConstructorOverLoading {
    String name;
    
    ConstructorOverLoading() {System.out.println("Default constructor is called.");}
    ConstructorOverLoading(String t)
    {
        name=t;
        System.out.println("Parameterized constructor is called.");
    }
    
    public static void main(String args[])
    {
        ConstructorOverLoading ob1=new ConstructorOverLoading();
        ConstructorOverLoading ob2=new ConstructorOverLoading("Para of ob2");
        
        //lets try Method Overloadding
        
        ob1.setName("C++");
        ob1.setName();
        ob2.setName();
        
    }
    void setName(String t)
    {
        name=t;
        System.out.println(name);
    }
    void setName()
    {
        System.out.println(name);
    }
}
