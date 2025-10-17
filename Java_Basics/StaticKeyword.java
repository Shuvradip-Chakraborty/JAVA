class Mobile {

    String brand;
    int price;
    static String name; //making the variable static means all the changes to the varible will  be reflected both the objects, means it will be common..

    //creatind a  method to print all the details.
    public void show(){
        System.out.println(brand + " , " + price + " , " + name);
    }

    ///a static method, we can use a static variable inside a static method..
    public static void show1(){
        System.out.println("inside the static method.");
    }
}



public class StaticKeyword {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "IQOO";
        obj1.price = 21000;
        Mobile.name = "Neo 10r";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Redmi";
        obj2.price = 15000;
        Mobile.name = "Note 9 pro max";

        Mobile.name = "smartphone";  //though i change the name of the obj1, but the changes will be reflected as well as the name variable of obj2..

        obj1.show();
        obj2.show(); 


        //to access the static method we have to call this with class name
        Mobile.show1(); 

    }

}