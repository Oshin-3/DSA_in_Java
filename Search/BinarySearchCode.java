package com.Search;

public class BinarySearchCode {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int output = binarySearch(arr, 36);
        int outputAgnostic = orderAgnosticBinarySearch(arr, 4);
        System.out.println("Output: " + output);
        System.out.println("Output: " + outputAgnostic);
    }
}