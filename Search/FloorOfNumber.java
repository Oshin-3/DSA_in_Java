package com.Search;
// largest number smaller than the target
public class FloorOfNumber {

    public static int floorOfNumber(int[] arr, int target)
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

        return arr[end];
    }


    public static void main(String[] args) {
        int output = floorOfNumber(new int[]{2,3,5,9,14,16,18}, 15);
        System.out.println("Output: " + output);


    }
}