package com.LeetCodePractice;

import java.util.Arrays;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {


        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            int curr = arr2[i];
            for (int j = count; j < arr1.length; j++) {
                for (int k = j; k < arr1.length; k++) {
                    if (arr1[k] == curr)
                    {
                        //swap
                        int temp = arr1[k];
                        arr1[k] = arr1[j];
                        arr1[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }

        for (int i = count; i < arr1.length-1; i++) {
            for (int j = i+1; j > count; j--) {
                if (arr1[j-1] > arr1[j])
                {
                    int temp = arr1[j-1];
                    arr1[j-1] = arr1[j];
                    arr1[j] = temp;
                }
                else
                {
                    break;
                }
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(relativeSortArray(new int[]{26,21,11,20,50,34,1,18}, new int[]{21,11,26,20})));
    }
}
