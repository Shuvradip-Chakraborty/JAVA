class Student {
    private int age;
    private String name;

    /*now creating a constructor for assigning the initial value to the instance variable, Constructor name should be same as the class name, but it should not had any return type..*/
    
    //a constructor:= called automatically when the object is created...

    public Student(){   //default constructor..
        System.out.println("In the constructor");
        age = 12;
        name = "Babu";
    }

    //parameterized constructor..
    public Student(int age, String name){
       this.age = age;
       this.name = name;
    }
    
    /// methods getter-setter..
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}


public class UseOfConstructor {
    public static void main(String[] args) {
        Student obj = new Student();
        // obj.setAge(40);
        // obj.setName("Subir");
        System.out.println(obj.getAge() + " ,  " + obj.getName());
        

        //creating 2nd object for parameterized constructor..
        Student obj1 = new Student(22,"Titir");
        System.out.println(obj1.getAge() + " , " + obj1.getName());


    }
}
