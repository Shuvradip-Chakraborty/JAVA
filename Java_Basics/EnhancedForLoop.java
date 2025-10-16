public class EnhancedForLoop {
    public static void main(String[] args) {
        int nums[] = new int[4];

        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 7;
        nums[3] = 6;

        ///normal for loop
        // for(int i=0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }


        for(int n: nums){
            System.out.println(n);
        }
    }
}
