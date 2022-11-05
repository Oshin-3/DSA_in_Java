package com.Search;

public class FindElementInInfiniteArray {

    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        int mid = 0;

        while (start <= end)
        {
            mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    // Since it is an infinite arr we do not know the start and end therefore cannot use .length function
    //First we have to find start and end position
    public static int findStartAndEnd(int[] arr, int target)
    {
        int result = 0;

        int start = 0;
        int end = 1;
        int n = 1;

        while (target > arr[end])
        {
            n += 1;
            start = end + 1;
            end += (n * 2);
        }

        result = binarySearch(arr, target, start, end);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 22, 23, 30};
        int[] arr1 = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int output = findStartAndEnd(arr1, 90);
        System.out.println("Output: " + output);
    }
}
