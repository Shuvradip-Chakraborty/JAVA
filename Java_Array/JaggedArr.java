public class JaggedArr {
    public static void main(String[] args) {
        
        /*In jagged array, though the rows number is declared but the column number is not.
        Also we have to mention the first element of each row..
         */

        int nums[][] = new int[3][];  
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[7];

        //generating the random value...
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }


        //printing the jagged array using enhanced for loop..
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}