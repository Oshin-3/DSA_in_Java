package com.LeetCodePractice;

import java.util.Arrays;

public class FindErrorNums {

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        while (i < nums.length) {
            int curr = nums[i] - 1;
            if (nums[i] != nums[curr])
            {
                //swap
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }
            else
            {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]-1 != j)
            {
                result[0] = nums[j];
                result[1] = j + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
    }
}
