package com.LeetCodePractice;

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j-1] % 2 != 0)
                {
                    //swap
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                else
                {
                    break;
                }
            }
        }

        return nums;
    }

    public static int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 && i % 2 == 0)
            {
                for (int j = 1; j < nums.length ; j+=2) {
                    if (nums[j] % 2 == 0)
                    {
                        //swap
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
            if (nums[i] % 2 == 0 && i % 2 != 0)
            {
                for (int j = 0; j < nums.length ; j+=2) {
                    if (nums[j] % 2 != 0)
                    {
                        //swap
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }

        }

        return nums;
    }

    public static void main(String[] args) {
        //System.out.println("Output: " + Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
        System.out.println("Output: " + Arrays.toString(sortArrayByParityII(new int[]{3,1,4,2})));
    }
}
