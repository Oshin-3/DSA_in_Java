import java.util.ArrayList;
import java.util.Arrays;

public class FindPosition {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
            {
                count += 1;
                temp.add(i);
            }
        }

        if(count == 1)
        {
            result[0] = result[1] = temp.get(0);
        }
        else if (count > 1)
        {
            result[0] = temp.get(0);
            result[1] = temp.get(temp.size()-1);
        }
        else
        {
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] output = searchRange(new int[]{1,4}, 4);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
