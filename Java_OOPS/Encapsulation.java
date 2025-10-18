class Human {
    //we made the instance variable private so we can access those variable inside this class or inside a method within the same class..

    //HERE THE ENCAPSULATION, no one outside the class can access the datas..
    private int age;
    private String name;

    //these methods can only access those variable..
    public int getAge(){
        return age;
    }

    //we can also use a methods to set the data..
    public void setAge(int age){      
        // age = a;        //here "a" is local variable & "age" is instance variable..
        this.age = age;
    }

    public String getName(){
        return name;
    }

    //we can also use a methods to set the data..
    public void setName(String name){
        this.name = name;   //this refers to the cuurent object...
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
