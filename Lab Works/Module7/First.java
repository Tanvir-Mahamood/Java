package Module7;
import javax.sound.sampled.SourceDataLine;

class A{
    int x;
    public A(){
        x=0;
    }
    public A(int x){
        this.x=x;
    }
    public int getX(){
        return(x+10);
    }
}
class B extends A{
        int x=20;
        public B(){
            x = 0;
        }
        //call parameterized constructor
        public B(int a){
            super(a);
            x = a;
        }
        public int getX(){
            return(x+10);
        }
        //statement to getX of class A in class B
        int xA = super.getX();
        //displaying x of class A from B
        public void displayX(){
            System.out.println(super.x);
        }
}
    public class First{
        public static void main(String[] args) {
            B obj = new B();
            obj.displayX();
        }
    }