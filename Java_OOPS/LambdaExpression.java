
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("in show.");
//     }
// }

//here in main class we can do the same thing with annonymous inner class..

/* 
 * 
 * public class LambdaExpression {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in show.");
            }
        };

        obj.show();
    }
}
 * 
*/

///here the above thing also can be replaced with the "Lambda Expression.."

public class LambdaExpression
{
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("in show.");
        };

        obj.show();
    }
}