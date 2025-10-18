/*Polymorphisms allows an object to behave differently based on its type or context.
 * It has two types ->
 * 1. Compile-time Polymorphism. (same as method overloading)
 * 2. Run-time Polymorphism. (same as method overriding)
 */

 /// COMPILE-TIME POLYMORPHISM...
 class PolyCompile{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(double n1, double n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
 }

 ///RUN-TIME POLYMORPHISM...
class PolyRun{
    public void sound(){
        System.out.println("Hiii");
    }
}
//here child class's sound method override the sound method of parent class..
class PolyRun1 extends PolyRun{
    public void sound(){
        System.out.println("Hello");
    }
}
    


public class Polymorphisms {
    public static void main(String[] args) {
        PolyCompile obj = new PolyCompile();
        int r1 = obj.add(4, 5);
        int r2 = obj.add(5, 1, 4);
        double r3 = obj.add(56, 4);

        System.out.println(r1 + " , " + r2 + " , " +  r3);



        PolyRun1 obj1 = new PolyRun1();
        obj1.sound();
    }

}
