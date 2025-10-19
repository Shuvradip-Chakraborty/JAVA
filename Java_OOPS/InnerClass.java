
/* Inner class means, there's another class inside the class , We can call it Nested class. */

//here creating a class Outer which has the variable, method and also another class Inner inside it...
class Outer{
    int a;

    public void show(){
        System.out.println("in Show.");
    }

    ///inside the Outer class..
    class Inner{
        public void config(){
            System.out.println("In config..");
        }
    }


}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        //Inner class belong to Outer, so we have to mention it..
        //to create object of Inner we have to use object of OUter..
        Outer.Inner obj1 = obj.new Inner();
        obj1.config();
    }
}
