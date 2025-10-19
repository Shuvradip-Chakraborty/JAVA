
class A{
    public void show1(){
        System.out.println("in A show.");
    }
}
class B extends A {
    public void show2(){
        System.out.println("in B show.");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        A obj = new A();  
        ///now we can do onething that,
        /// we can create an object which has reference of A and object of B.
    
        A obj1 = (A) new B();  //here we typecast with parent class means upcasting...
        obj1.show1();

        B obj2 = (B)obj; //here obj2 and obj aren't same, but obj is the object of B,so we can downcast it to subclass B..
        obj2.show2();
    }    
}
