package com.LeetCodePractice;

public class SearchInRotatedSortedArray2 {

    public static boolean binary(int[] nums, int target, int start, int end)
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


    public static int pivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if(nums[start] == nums[end])
            {
                start++; end--;
            }
            else
            {
                if(mid < end && nums[mid] >= nums[mid+1])
                    return mid;

                if(mid > start && nums[mid] < nums[mid-1])
                    return mid - 1;

                if(nums[start] < nums[end] && nums[start] == nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return start;
    }


    public static boolean search(int[] nums, int target) {
        // we have to find pivot index
        boolean ans = false;

        int pivot = pivot(nums);

//        if(pivot == -1)
//        {
//            ans = binary(nums, target, 0, nums.length-1);
//            return ans;
//        }
//        else
//        {
            ans = binary(nums, target, 0, pivot);
//        }


        if(!ans)
            ans = binary(nums, target, pivot+1, nums.length-1);

        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Output: " + search(new int[]{1,0,1,1,1}, 0));
    }
}
