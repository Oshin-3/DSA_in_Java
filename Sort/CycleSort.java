package com.Sort;

import java.util.Arrays;

public class CycleSort {

    public CycleSort(int[] arr)
    {
        cycleSort(arr);
    }

    public void cycleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; ) {
            int currPosition = arr[i] - 1;
            if (arr[i] != arr[currPosition])
            {
                Swap swap = new Swap(arr, i, currPosition);
            }
            else
            {
                i++;
            }
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }

}
