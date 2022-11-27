package com.Sort;

import java.util.Arrays;

public class InsertionSort {

    public InsertionSort(int[] arr)
    {
        insertionSort(arr);
    }

    public void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j-1] > arr[j])
                {
                    Swap swap = new Swap(arr, j, j - 1);
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }

}
