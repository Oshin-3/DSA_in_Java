import java.util.Arrays;

public class ArrayPermutation {

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] output = buildArray(new int[]{0,2,1,5,3,4});
        System.out.println("Output: " + Arrays.toString(output));
    }
}
