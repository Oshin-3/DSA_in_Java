package com.LeetCodePractice;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length-1;

        while (start <= end)
        {
            int sum = numbers[start] + numbers[end];
            if (sum == target)
                return new int[]{start+1, end+1};
            if (sum > target)
                end--;
            else
                start++;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15, 16, 17};
        int[] output = twoSum(numbers, 27);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
