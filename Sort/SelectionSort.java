package com.Sort;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int max = max(arr, arr.length - 1 - i);

            Swap s = new Swap();
            s.swap(arr, max, arr.length - 1 - i);


            }
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public int max(int[] arr, int end)
    {
        int max = 0;
        for (int i = 0; i <= end ; i++) {
            if (arr[i] > arr[max])
                max = i;

        }

        return max;
    }


}
