package com.LeetCodePractice;

import java.util.Arrays;

public class MaximumProduct {

    public static void insertionSort(int[] nums)
    {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                arr[i] = nums[i] * (-1);
            else
                arr[i] = nums[i];
        }

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {

                if (arr[j-1] < arr[j])
                {
                    int temp1 = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp1;

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
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int product = Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        return product;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + maximumProduct(new int[]{1,-2,-3,-100}));
    }
}
