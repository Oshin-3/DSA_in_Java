package com.Sort;

public class Swap {

    public Swap(int[] arr, int curIndex, int preIndex)
    {
        this.swap(arr, curIndex, preIndex);
    }

    public void swap(int[] arr, int curIndex, int preIndex)
    {
        int temp = arr[curIndex];
        arr[curIndex] = arr[preIndex];
        arr[preIndex] = temp;
    }
}
