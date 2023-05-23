public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(arrayAverage(nums));

        //int[] nums1 = null;
        //System.out.println(arrayAverage(nums1)); //NullPointerException on line 7

        //System.out.println(nums[5]); //ArrayIndexOutOfBoundsException on line 9
        //Solution: Set a break point where the initial error occurred(line 7).
        //Notice the error it says "NullPointer" and notice that nums1 is set to null, so giving it values should fix this.
        //After fixing the null pointer era, we can repeat the process with line 9, noticing that we nums[5] does not exist, so we change it to nums[4].
        //Final fix:

        int[] nums1 = {1,2,3};
        System.out.println(arrayAverage(nums1));

        System.out.println(nums[4]);

        System.out.println(calculateSum(nums));

    }

    public static double arrayAverage(int[] nums){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        return total/nums.length;
    }
    public static int calculateSum(int[] array) {
        //int result = 1;  // Logic error: initializing result to 1 instead of 0
        //Since it can be hard to initially notice small mistakes like this, we might not know where to put the breakpoint
        //However, we should be able to tell where we go wrong by noticing that we are returning a numbered valued 1 more than what it should
        // If that doesn't point you in the right direction, you can try printing the value of result in the loop to see it change
        // this should show that you initially set the value too high.
        //so we just need to change result to 0;

        int result = 0;
        for (int number : array) {
            result += number;
        }
        return result;
    }
}