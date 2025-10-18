/* It's also an example of the Polymorphism specially the runtime polymorphism.. */
class X {
     public void show(){
        System.out.println("in X.");
     }
}

class Y extends X{
    public void show(){
        System.out.println("in Y.");
    }
}

class Z extends X{
    public void show(){
        System.out.println("in Z.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        X obj = new X(); ///here obj is variable and X is it's datatype and new X() is the object creation..
        obj. show();

        obj = new Y(); //same here, we assign a new object Y() to same varible..
        obj.show();

        obj = new Z();
        obj.show();
    }
}
