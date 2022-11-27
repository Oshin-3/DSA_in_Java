package com.Sort;

public class Swap {

    public void swap(int[] arr, int curIndex, int preIndex)
    {
        int temp = arr[curIndex];
        arr[curIndex] = arr[preIndex];
        arr[preIndex] = temp;
    }
}
