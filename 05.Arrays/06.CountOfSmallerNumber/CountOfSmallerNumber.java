import java.util.Arrays;

public class CountOfSmallerNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] finalCount = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(j != i)
                    if(nums[i] > nums[j])
                        count += 1;
            }
            finalCount[i] = count;
        }
        return finalCount;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] output = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(output));
    }
}
