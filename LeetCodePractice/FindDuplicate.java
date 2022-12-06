package com.LeetCodePractice;

public class FindDuplicate {

    public static int findDuplicate(int[] nums){

        for (int i = 0; i < nums.length;) {
            if (nums[i] != i + 1)
            {
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
                    return nums[i];
                }
            }
            else
            {
                i++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + findDuplicate(new int[]{1,1,4,2,3}));

    }
}
