package com.LeetCodePractice;

public class FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {

       int start = 1;
       int end = nums.length - 1;
       int dup = -1;
       while (start <= end)
       {
           int count = 0;
           int mid = start + (end - start) / 2;
           for (int i = 0; i < nums.length; i++) {
               if (nums[i] <= mid)
                   count++;
           }
           if (count > mid)
           {
               // search is left half
               dup = mid;
               end = mid - 1;
           }
           else
           {
               //search in right half
               start = mid + 1;
           }
       }

       return dup;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + findDuplicate(new int[]{1,1}));
    }
}
