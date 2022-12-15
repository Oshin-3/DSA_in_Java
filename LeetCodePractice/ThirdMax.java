package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMax {

    public static void insertSort(int[] nums)
    {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j-1] < nums[j])
                {
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
    public static int thirdMax(int[] nums) {
        //sort
        insertSort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i])
                count++;
            else
                continue;

            if (count == 3)
                return nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println("Output: " + thirdMax(new int[]{3,2,1,2}));
    }
}
