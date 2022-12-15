package com.LeetCodePractice;

import com.Sort.Swap;

public class ContainsDuplicate {

    public static void insertionSort(int[] nums)
    {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j] < nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else
                    break;
            }
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        //sort
        //insertionSort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] == nums[j-1])
                    return true;
                if (nums[j] < nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else
                    break;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + containsDuplicate(new int[]{2,14,18,22,22}));
    }
}
