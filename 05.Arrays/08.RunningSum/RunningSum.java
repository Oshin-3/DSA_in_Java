import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
            runningSum[i+1] = nums[i+1] + runningSum[i];
        }

        return runningSum;
    }

    public static void main(String[] args) {
        int[] output = runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(output));
    }
}
