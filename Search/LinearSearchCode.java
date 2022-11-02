package com.Search;

public class LinearSearchCode {

    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int output = linearSearch(arr, 11);
        System.out.println("Output: " + output);
    }
}
