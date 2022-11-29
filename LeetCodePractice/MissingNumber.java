package com.LeetCodePractice;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length;) {

            int currPosition = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[currPosition])
            {
                //swap
                int temp = nums[i];
                nums[i] = nums[currPosition];
                nums[currPosition] = temp;
            }
            else
            {
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }

        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + missingNumber(new int[]{0,1}));

    }
}
