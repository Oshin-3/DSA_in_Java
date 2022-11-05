package com.Search;

// Peak Index in a Mountain Array

public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        //using binary search approach

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (arr[mid-1] > arr[mid])
        {
            mid = mid - 1;
        }

        while (arr[mid+1] > arr[mid])
        {
            mid = mid + 1;
        }

        return mid;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 10,20,21, 5, 2};
        System.out.println("Output: " + peakIndexInMountainArray(arr));
    }
}
