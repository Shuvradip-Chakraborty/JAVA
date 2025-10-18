
/*EVERY CLASS IN JAVA EXTENDS THE OBJECT CLASS.. */

class A{
    //creating a default constructor of A
    public A(){
        super();
        System.out.println("in A.");
    }
    //creating a parameterized constructor of A..
    public A(int n){
        super();
        System.out.println("in A int.");
    }
}
class B extends A{
    //creating a default constructor of B..
    public B(){
        super();
        System.out.println("in B.");
    }
    //creating a parameterized constructor of B..
    public B(int n){
        //calls the constructor of the parent class..
        // super(n);    /*passing parameter in super refers the parameterized constructor in the parent class. */

        this(); //executes the current class constructor..
        System.out.println("in B int.");
    }
}



public class ThisAndSuperMethod {
    public static void main(String[] args) {
        //now creating an object of B
        B obj = new B(5);
    }
}
