package com.Search;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
//        Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//        If target is not found in the array, return [-1, -1].
//
//        You must write an algorithm with O(log n) runtime complexity.
public class FirstandLastPosition {

    public  static int findIndexofOccurrence(int[] nums, int target, boolean firstOccurrence)
    {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int ans = -1;

        while (start <= end)
        {
            mid = start + (end - start)/2;
            if (target == nums[mid])
            {
                ans = mid;
                if(firstOccurrence)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // for first occurrence
        result[0] = findIndexofOccurrence(nums, target, true);
        // for last occurrence
        result[1] = findIndexofOccurrence(nums, target, false);

        return result;
    }

    public static void main(String[] args) {
        int[] output = searchRange(new int[]{5,7,7,8,8,10}, 11);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
