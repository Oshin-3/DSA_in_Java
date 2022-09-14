import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] finalArr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            finalArr[j] = nums[i];
            finalArr[j+1] = nums[n+i];
            j += 2;
        }

        return finalArr;
    }

    public static void main(String[] args) {
        int[] output = shuffle(new int[]{2,5,1,3,4,7}, 3);
        System.out.println(Arrays.toString(output));
    }
}
