/* Threads in java is a lightweight process and a small unit of excution inside the process,
 * MultiThreading means handling multiple processes simultaneously..
 */

/* below in the code what happens after calling obj1 with show() method, it will execute the whole task, then move to the obj2's show() method..  */

class A extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hi!");
            try {
                 Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
           
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello!");
            try {
                 Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreading{
    public static void main(String[] args) {
         A obj1 = new A();
         B obj2 = new B();

         //obj2.setPriority(Thread.MAX_PRIORITY); 
         //with this we are just suggesting our scheduler that this thread should get highest priority.

         obj1.start();
         obj2.start();
    }
}