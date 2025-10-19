
class Laptop{
    String model;
    int price;
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Asus Vivobook";
        obj.price = 55000;
        
        System.out.println(obj); ///here we get some hexadecimal values..
        System.out.println(obj.toString()); //toString() method also gives the same result..here toString() method belongs to Object class..
    }
}