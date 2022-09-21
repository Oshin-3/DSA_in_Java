import java.lang.reflect.Array;
import java.util.Arrays;

public class TargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] finalArr = new int[nums.length];

        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (finalArr[index[i]] == -1)
            {
                finalArr[index[i]] = nums[i];
            }
            else
            {
                int len = finalArr.length - 1;
                int insertPosition = index[i];
                while (len > insertPosition)
                {
                    finalArr[len] = finalArr[len-1];
                    len -= 1;
                }
                finalArr[insertPosition] = nums[i];
            }
        }

        return finalArr;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0}; int[] index = {0,1,0};
        int[] output = createTargetArray(nums,index);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
