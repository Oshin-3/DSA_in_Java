import java.util.ArrayList;
import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int productLeft = 1, productRight = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = productLeft;
            productLeft *= nums[i];
        }

        for (int i = nums.length-1; i >= 0; i--) {
            result[i] *= productRight;
            productRight *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] output = productExceptSelf(new int[]{1,2,3,4});
        System.out.println("Output: " + Arrays.toString(output));
    }
}
