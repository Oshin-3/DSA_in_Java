import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target && count == 0)
                {
                    temp[0] = i;
                    temp[1] = j;
                    count += 1;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
