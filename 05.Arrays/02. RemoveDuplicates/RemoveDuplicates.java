import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] expectedNums;
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if(i == nums[j] && !temp.contains(i))
                {
                    temp.add(i);
                    k += 1;
                    break;
                }

            }
        }
        //System.out.println("temp " + temp);
        int count1 = 0;
        for (int i = 0; i<temp.size(); i++)
        {
            int val = temp.get(i);
            nums[count1] = val;
            count1 += 1;
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] expectedNums = {0,1,2,3,4};
        int k = removeDuplicates(nums);

    }



}
