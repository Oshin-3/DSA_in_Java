package com.LeetCodePractice;

public class KthMissingPositiveNumber {

    public static int findKthPositive(int[] arr, int k) {

        int start = 0;
        int end = arr.length;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] - 1 - mid < k )
                start = mid + 1;
            else
                end = mid;
        }

        return start+k;

    }

    public static void main(String[] args) {
        System.out.println("Output: " + findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
}
