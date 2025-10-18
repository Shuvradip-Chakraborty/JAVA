class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
    
}

//inheritance occurs here...

//AdvCalc is subclass and Calc is superclass...
class AdvCalc extends Calc{
    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

//now MULTILEVEL INHERITANCE...
class VeryAdvCalc extends AdvCalc
{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}



public class UseOfInheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 6);
        int r2 = obj.sub(10, 2);
        int r3 = obj.multi(10, 2);  ///wee are able to access the method multi and div becasue of inheritance..
        int r4 = obj.div(10, 2);
        double r5 = obj.power(4, 2);
        

        System.out.println(r1 + " , " + r2 + " , " + r3 + " , " + r4 + " , " + r5);
    }
}
