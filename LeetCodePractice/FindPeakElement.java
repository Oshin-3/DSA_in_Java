package com.LeetCodePractice;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid+1] || mid == nums.length-1)
                end = mid;
            else
                start = mid + 1;


        }

        return start;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + findPeakElement(new int[]{6,5,4,3,2,3,2}));
    }
}
