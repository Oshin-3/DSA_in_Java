public class CountWithEvenNumberDigits {

    public static int findNumbers(int[] nums) {
        int finalCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int temp = nums[i];
            while (temp != 0)
            {
                count += 1;
                temp /= 10;
            }
            if(count%2 == 0)
                finalCount += 1;
        }

        return finalCount;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int output = findNumbers(nums);
        System.out.println("Output = " + output);
    }
}
