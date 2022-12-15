package com.LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {

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
    
    public static int binarySearch(int[] nums, int target, int start, int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return nums[mid];
            if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

    return -1;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList temp = new ArrayList();
        int[] arr1;
        int[] arr2;
        int len = 0;
        // check small array
        if (nums1.length > nums2.length)
        {
            insertionSort(nums1);
            len = nums2.length;
            arr1 = nums1;
            arr2 = nums2;
        }
        else
        {
            insertionSort(nums2);
            len = nums1.length;
            arr1 = nums2;
            arr2 = nums1;
        }


        for (int i = 0; i < len; i++) {
            if (!temp.contains(arr2[i]))
            {
                int value = binarySearch(arr1, arr2[i], 0, arr1.length-1);
                if (value != -1)
                {
                    temp.add(value);
                }
            }
        }

        int[] result = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            result[i] = (int)temp.get(i);
        }


        return result;
    }

    public static int[] intersectionII(int[] nums1, int[] nums2) {

        ArrayList temp = new ArrayList();
        int[] arr1;
        int[] arr2;
        int len = 0;
        // check small array
        if (nums1.length > nums2.length)
        {
            //insertionSort(nums1);
            Arrays.sort(nums1);
            len = nums2.length;
            arr1 = nums1;
            arr2 = nums2;
        }
        else
        {
            //insertionSort(nums2);
            Arrays.sort(nums2);
            len = nums1.length;
            arr1 = nums2;
            arr2 = nums1;
        }


        for (int i = 0; i < len; i++) {
            int value = binarySearch(arr1, arr2[i], 0, arr1.length-1);
            if (value != -1)
            {
                temp.add(value);
            }
        }

        int[] result = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            result[i] = (int)temp.get(i);
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(intersectionII(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}
