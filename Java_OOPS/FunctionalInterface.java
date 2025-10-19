/* in Functional interface there's only one method inside the interface. */

// @FunctionalInterface
interface A{
     void show();
}

/*
 * class B implements A{
    public void show(){
        System.out.println("in Show.");
    }
}
 */


public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = new A() //here we use annonymous inner classs...
        {
            public void show(){
                System.out.println("in Show..");
            }     
        };
        obj.show();
    }
}
