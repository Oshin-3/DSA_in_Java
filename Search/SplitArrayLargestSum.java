package com.Search;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        // we have to find the range to apply binary search
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        //Now we have found the range so can apply binary search
        while (start < end)
        {
            int mid = start + (end - start)/2;
            int countOfSubArray = 0;

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                // sum should be <= mid value;
                if(sum > mid)
                {
                    sum = 0;
                    i--;
                    countOfSubArray++;
                }
            }
            countOfSubArray++;
            // now your countOfSubArray should be <= given k value
            //countOfSubArray should be <= given k value means search on LHS
            //else search in RHS
            if(countOfSubArray <= k)
                end = mid;
            else
                start = mid + 1;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7, 2, 5, 10, 8};
        int output = splitArray(nums, 2);
        System.out.println("Output: " + output);
    }
}
