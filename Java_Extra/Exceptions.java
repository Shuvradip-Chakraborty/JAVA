public class Exceptions{
    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        int result = 0;
        String str = null;

        // int result = i/j;   ///thiss  throws an exception => Arithmatic exception..

        //another exception..
        int nums[] = new int[5];

        try {
            result = i / j;

            System.out.println(str.length()); //here are all the exception when one exception is found it will go to the catch section..
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero." );
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit.");
        } catch(Exception e){
            System.out.println("something went wrong.");
        }


        
        System.out.println(result);
    }
}




// in exception hierarchy parent expection should be at the bottom..