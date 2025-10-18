

class A {
    public void show(){
        System.out.println("in A show.");
    }
    public void config(){
        System.out.println("in A config.");
    }    
}

class B extends A{
    ///here the method name is as the parent class and the method of the child class overrides the method of the parent class..
    public void show(){
        System.out.println("in B show.");
    }
}

public class MethodOverrriding {
    public static void main(String[] args) {
      B obj = new B();
      obj.show();  
      obj.config();
    }    
}
