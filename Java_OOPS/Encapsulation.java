class Human {
    //we made the instance variable private so we can access those variable inside this class or inside a method within the same class..

    //HERE THE ENCAPSULATION, no one outside the class can access the datas..
    private int age;
    private String name;

    //these methods can only access those variable..
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    //we can also use a methods to set the data..
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        
        obj.setAge(22);
        obj.setName("Shuvo");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
