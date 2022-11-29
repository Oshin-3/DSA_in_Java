package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public static void swap(int[] nums, int currIndex, int correctIndex)
    {
        int temp = nums[currIndex];
        nums[currIndex] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length;) {

            int currPosition = nums[i] - 1;
            if (nums[i] != nums[currPosition])
            {
                //swap
                swap(nums, i, currPosition);
            }
            else
            {
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]-1)
            {
                result.add(i+1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
