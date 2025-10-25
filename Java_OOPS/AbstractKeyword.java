
/* Abstract method only belongs to Abstract class
 * We can't create object of the Abstract class.
 * It's not necessary to have only the abstract method, it aslo have normal and also have abstract method..
 * abstract method must be implemented in the subclass.
 */

abstract class Car{     //abstract class
    abstract public void drive();

    public void playMusic(){
        System.out.println("play music.");
    }
}

class Alto extends Car{
    public void drive(){
        System.out.println("driving..");
    }
}

public class AbstractKeyword {      //concrete class..
    public static void main(String[] args) {
        Car obj = new Alto();
        obj.drive();
        obj.playMusic();
    }
}
