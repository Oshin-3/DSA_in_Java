package com.LeetCodePractice;

public class SearchInRotatedSortedArray2 {

    public static boolean binarySearch(int[] nums, int target, int start, int end)
    {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            else if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
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

            if(nums[start] == nums[mid] && nums[end] == nums[mid])
            {
                // skip the duplicated.
                // if start is the pivot
                if (nums[start] > nums[start+1])
                    return start;
                start++;
                //if end is the pivot
                if (nums[end] < nums[end-1])
                    return end - 1;
            }// left is sorted then pivot is in right
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return -1;
    }


    public static boolean search(int[] nums, int target) {
        // we have to find pivot
        int pivot = findPivot(nums);
        boolean result = false;

        //check in left side
        result = binarySearch(nums, target, 0, pivot);
        if(!result)
            result = binarySearch(nums, target, pivot+1, nums.length-1);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + search(new int[]{1,0,1,1,1}, 0));
    }
}
