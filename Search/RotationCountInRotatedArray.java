package com.Search;

public class RotationCountInRotatedArray {

    public static int rotationCount(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int mid = start + (end - start)/2;

            if(mid > start && arr[mid] < arr[mid-1])
                return mid;

            if(mid < end && arr[mid] > arr[mid+1])
                return mid+1;

            if(arr[mid] <= arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return arr.length;
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end)
        {
            int mid = start + (end - start)/2;

            if(mid > start && nums[mid] < nums[mid-1])
                return nums[mid];

            if(mid < end && nums[mid] > nums[mid+1])
                return nums[mid+1];

            if(nums[mid] <= nums[start])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return nums[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int output = rotationCount(arr);
        int minValue = findMin(arr);
        System.out.println("Rotation count: " + output);
        System.out.println("Minimum value: " + minValue);
    }
}
