package com.LeetCodePractice;

//https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int curr = nums[i] - 1;
            if ( curr >= 0 && curr < nums.length && nums[i] != nums[curr])
            {
                //swap
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }
            else
            {
                i++;
            }
        }

        //check if 1st element is 1
        if (nums[0] == 1)
        {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j+1)
                    return j + 1;
            }
        }
        else
        {
            return 1;
        }

        return i+1;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + firstMissingPositive(new int[]{0,1,2}));
    }
}
