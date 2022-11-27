package com.Sort;

import java.util.Arrays;

public class BubbleSort {

//    public void swap(int[] arr, int curIndex, int preIndex)
//    {
//        int temp = arr[curIndex];
//        arr[curIndex] = arr[preIndex];
//        arr[preIndex] = temp;
//    }


    public void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1])
                {
                    //swap
                    Swap s = new Swap();
                    s.swap(arr, j, j - 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }

}
