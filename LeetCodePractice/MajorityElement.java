package com.LeetCodePractice;

import com.Sort.Swap;

import java.util.Arrays;

public class MajorityElement {

    public static void insertionSort(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
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
    public static void binarySort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1])
                {
                    //swap
                    //Swap s = new Swap(nums, j, j - 1);
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    //s.swap(arr, j, j - 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static int majorityElement(int[] nums) {
        //sort using selection sort
        //binarySort(nums);
        insertionSort(nums);

        //check if 1st element of array is 1
        for (int i = 0; i < nums.length;) {
            int majority = nums[i];
            int count = 0;

            while (i < nums.length && nums[i] == majority)
            {
                count++;
                i++;
            }

            if (count > (nums.length/2))
            {
                return nums[i-1];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));;

    }
}
