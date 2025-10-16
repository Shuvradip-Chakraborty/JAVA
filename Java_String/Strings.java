public class Strings {
    public static void main(String[] args) {
        
        ///"String" is a class in java, means when we write String, there's automatically created an object..
        String name = "shuvradip";      //it's actually {String name = new String("shuvradip")}

        name = name + " chakraborty"; //here the string isn't modified but a new address is allocated means a new object is created.

        System.out.println("Hello " + name);

        String s1 = "Shuvradip";
        String s2 = "Shuvradip";

        System.out.println(s1 == s2); //it is true because both pointing to the same memory => String constant pool
    }
}
