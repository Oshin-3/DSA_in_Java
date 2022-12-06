package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] nums){

        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int curr = nums[i] - 1;
            if (nums[i] != nums[curr])
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

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]-1 != j)
            {
                result.add(nums[j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}
