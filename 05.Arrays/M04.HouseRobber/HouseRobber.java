public class HouseRobber {

    public static int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        if(nums.length == 0)
            return 0;
        for (int num: nums)
        {
            int temp = prev1;
            prev1 = Math.max(prev2+num, prev1);
            prev2 = temp;
        }

        return prev1;

    }

    public static void main(String[] args) {
        int output = rob(new int[]{2,7,9,3,1});
        System.out.println("Output: " + output);
    }
}
