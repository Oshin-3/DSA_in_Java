public class MaxSubArraySum {

    public static int maxSubArray(int[] nums) {
        int max = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++)
        {
            max += nums[i];
            if(maxSoFar < max)
                maxSoFar = max;
            if(max < 0)
                max = 0;
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int output = maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("Output: " + output);
    }
}
