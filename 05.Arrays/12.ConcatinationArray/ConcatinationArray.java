import java.util.Arrays;

public class ConcatinationArray {

    public static int[] getConcatenation(int[] nums) {
        int[] finalArr = new int[2*nums.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            finalArr[j] = nums[i];
            j += 1;
            if (i == nums.length-1 && count == 0)
            {
                i = -1;
                count += 1;
            }
        }

        return finalArr;
    }

    public static void main(String[] args) {
        int[] output = getConcatenation(new int[]{1,2,1});
        System.out.println("Output: " + Arrays.toString(output));
    }
}
