
///threads can also work with runnable interface..

class A implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){

            System.out.println("Hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingWithInterface {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();   
         //we have make it Runnable thread because Thread class can accept Runnable object in parameters, and also have to create threads t1 and t2 because they don't have any idea of class A and class B..

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
