package com.LeetCodePractice;

import java.util.Arrays;

public class ArrayRankTransform {

    public static int[] arrayRankTransform(int[] arr) {

        int[] result = new int[arr.length];
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        int rank = 0;
        for (int i = 0; i < temp.length; i++) {
            int position = temp[i];
            if (i > 0 && temp[i] == temp[i-1])
            {
                continue;
            }
            else
            {
                rank += 1;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == position)
                {
                    result[j] = rank;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
}
