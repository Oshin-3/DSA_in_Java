package com.Search;

public class FindInMountainArray {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        //int start = 0;
        //int end = arr.length - 1;

        boolean isAgnos = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;

            if (isAgnos) {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        //using binary search approach

        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid + 1;
        }

        return start;
    }

    public static int findInMountainArray(int[] arr, int target)
    {
        // first find the peak on mountain array
        int peakIndex = peakIndexInMountainArray(arr);
        int minIndexOfTarget = 0;
        // check in left side of peak value
        minIndexOfTarget = binarySearch(arr, target, 0, peakIndex);

        // if not present in left side then search in right side
        if(minIndexOfTarget == -1)
        {
            minIndexOfTarget = binarySearch(arr, target, peakIndex+1, arr.length-1);
        }

        return minIndexOfTarget;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{0,5,3,1};
        int output = findInMountainArray(arr, 1);
        System.out.println("Output: " + output);
    }
}
