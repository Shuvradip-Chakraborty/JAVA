
interface A{
    int add(int i, int j);
}

/*
 * 
public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        A obj = new A() {
            public int add(int i, int j){
                return i+j;
            }
        };

       int result =  obj.add(5, 7);
       System.out.println(result);
    }
}
 * 
 */
 // NOW WE CAN DO WITH LAMBDA EXPRESSION..


 
public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        A obj = (int i, int j) -> {
                return i+j;
            };
        

       int result =  obj.add(5, 7);
       System.out.println(result);
    }
}