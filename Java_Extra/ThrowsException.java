
//this is how we handle normal exception..
/*
 * class A{
    public void show(){
        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();//
            System.out.println("Not able to find the class.");
        }
    }
}
 */


//now using throws keyword, means whoever calling the method will be handling the exception..

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}


public class ThrowsException{
    public static void main(String[] args) {
        A obj = new A();
        try {
             obj.show();
        } catch (Exception e) {
            System.out.println("Class not found..");
        }
       
    }
}