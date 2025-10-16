// package Java_OOPS; 
// In Java we have to explicitly mention this to avoid conflicts in future, because there should be a chance to create a same class in another file or folder..
///Java strictly ties the physical folder structure to the logical package name.

//class 1..
class Computer {
    public void musicPlayer(){
        System.out.println("Music Playing");
    }

    public String buyMeAPen(int cost){
        if(cost >= 10)
                return "Pen";
        else 
            return "Nothing";
    }
}

///class 2..
/// AN EXAMPLE OF METHOD OVERLOADING....
class Calculator {
    int num=6;    ///instance variable..

    //three methods inside the class
    /*THREE METHODS INSIDE THE CLASS WITH SAME NAME BUT THE PARAMETERS ARE DISTINCT BY NUMBER AND ALSO BY DATATYPES OF THE PARAMETER, this  is known as method overloading.. */
    public int add(int n1, int n2){ //n1, n2 are local var.. 
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }
    
}

///main method
public class Demo {
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 6;
///we have to create a object to access the method add
       Calculator obj = new Calculator();
       Calculator obj2 = new Calculator(); //another object of same class
       
       int result = obj.add(num1, num2);
       System.out.println(result);

//creating an object of Computer..
        Computer obj1 = new Computer();
        obj1.musicPlayer();
        String str = obj1.buyMeAPen(11);
        System.out.println(str);

//accessing the instance variable
        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj2.num);


    }
}