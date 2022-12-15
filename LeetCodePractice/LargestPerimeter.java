package com.LeetCodePractice;

import java.util.Arrays;

public class LargestPerimeter {

    public static void insertionSort(int[] nums)
    {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
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


    public static int largestPerimeter(int[] nums) {
        //insertionSort(nums);

        Arrays.sort(nums);
        if (nums.length == 3)
        {
            int a = nums[0];
            int b = nums[1];
            int c = nums[2];
            if (a+b > c && a+c > b && b+c > a)
            {
                return a + b + c;
            }
            else
            {
                return 0;
            }
        }
        int i = nums.length-1;
        while (i >= 2)
        {
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if (a+b > c && a+c > b && b+c > a)
            {
                return a + b + c;
            }
            else
            {
                i--;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + largestPerimeter(new int[]{1,2,1,10}));
    }
}
