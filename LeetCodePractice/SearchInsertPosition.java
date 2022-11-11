package com.LeetCodePractice;

//https://leetcode.com/problems/search-insert-position/?envType=list&id=ohkos4ks
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;
    }

    public static void main(String[] args) {
        int output = searchInsert(new int[]{1,2,3,5,7,8,10}, 0);
        System.out.println("Output: " + output);
    }
}
