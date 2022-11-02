package com.Search;

public class CeilingOfNumber {

    public static int ceilingOfNumber(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return arr[start];
    }

    public static void main(String[] args) {
        int output = ceilingOfNumber(new int[]{2,3,5,9,14,16,18}, 15);
        System.out.println("Output: " + output);
    }
}
