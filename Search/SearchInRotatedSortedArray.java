package com.Search;

public class SearchInRotatedSortedArray {

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }

    public static int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while (start < end)
        {
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1])
                return mid;

            if(mid > start && nums[mid] < nums[mid-1])
                return mid - 1;

            if(nums[mid] <= nums[start])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }


    public static int search(int[] nums, int target) {
        // we have to find pivot
        int pivot = findPivot(nums);
        int result = 0;

        //check in left side
        result = binarySearch(nums, target, 0, pivot);
        if(result == -1)
            result = binarySearch(nums, target, pivot+1, nums.length-1);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,7,1,2,3,4,5};
        int output = search(nums, 6);
        System.out.println("Output: " + output);
    }
}
