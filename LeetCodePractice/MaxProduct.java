package com.LeetCodePractice;

import java.util.Arrays;

public class MaxProduct {

    public static int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int i = nums.length - 1;
        int j = i - 1;

        int product = (nums[i] - 1) * (nums[j] - 1);

        return product;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + maxProduct(new int[]{1,5,4,5}));
    }
}