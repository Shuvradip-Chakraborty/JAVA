/* final as variable, method and class.. */

//final as a class...
final class Calc{
    public void show(){
        System.out.println("in show Calc");
    }
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

///if we declare Calc as final, no class can inherits it..
/// 
/*class AdvCalc extends Calc{

}
*/

//final as a method..to stop method overriding....
class P{
    public final void done(){
        System.out.println("In done by Shuvo");
    }
}
/*
 * class Q extends P{
    //here method overriding occurs.. to stop we use final.
    public void done(){ ///this done() giving a error as parent class method is finall..
        System.out.println("NOt done.");
    }
}
 */




public class FinalVariable {
    public static void main(String[] args) {
        //final as variable...
        final int num = 5;
        // num = 6;  //it's not possible

        Calc obj = new Calc();
        obj.show();
        System.out.println(obj.add(4,7));
    }
}
