public class MultiDimensionalArr{
    public static void main(String[] args) {
        //two dimensional array..
        int nums [][] = new int [3][4];

        //generating the array elements with Math.random() => Math.random() generates the double value so it would be in points, so we need to multiply with 10/100/1000 to get out expected value, and also to typecast it from Double to Int..

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        ///printing the array elements...  
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }



        // printing with enhance for loop..
        for(int n[] : nums)   //stores the each row of nums as an 1D array
        {
            for(int m: n) //iterating over the 1D array..
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}