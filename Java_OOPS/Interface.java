/* when there is a class which only contains the abstract method declaration not the method definition, wee can call the class interface without calling the class abstract.. 
 * Also the variables in the interface are final and static by default...
*/


interface A{

    //variables are final and static in interface..
    int age = 22;
    String area = "Kolkata";

    public abstract void show();
    public abstract void config();
}

interface X{
    void run();
}

//for interface we have to use the keyword "implements"... and also write all the methods defined in the interface..
class B implements A,X
{
    public void show(){
        System.out.println("in show.");
    }

    public void config(){
        System.out.println("in config.");
    }

    public void run(){
        System.out.println("Running.");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
    }
}


/* 
 * POINTS TO REMEMBER...
 * 1. class - class -> extends
 * 2. class - interface -> implements
 * 3. interface - interface -> extends
 */
