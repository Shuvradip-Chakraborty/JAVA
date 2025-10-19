
abstract class Computer{
    // public void code(){

    // }

    //instead of defining the method we just declare the method as an abstract method

    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Code, Compile, Run..");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Code, Compile, Run  : Faster");
    }
}



class Developer{
   public void devApp(Computer lap){
        lap.code();
   } 
}


public class InterfaceNeed {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer shuvo = new Developer();
        shuvo.devApp(desk);
    }
}


/* Now instead of using abstract class we can do use interface here, also we have to change the extends keyword with the implements keyword.. */