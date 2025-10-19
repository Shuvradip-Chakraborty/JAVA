
class Outer{
    public void show(){
        System.out.println("In A show..");
    }
}

/* 
class Inner extends Outer {
    public void show(){
        System.out.println("In B show...");
    } 
}
*/

///without creating a new class we have to just implement in the main class after the object creation..

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer()
        {//this is the new class creted and instantiated without name..
        public void show(){
            System.out.println("In new show...");
             } 
        };
        
        obj.show();
    }
}
