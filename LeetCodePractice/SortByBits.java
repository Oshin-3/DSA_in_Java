package com.LeetCodePractice;

import java.util.Arrays;

public class SortByBits {

    public static int[] sortByBits(int[] arr) {

        long[] temp= new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = Integer.parseInt(Integer.toBinaryString(arr[i]));
        }
        System.out.println(Arrays.toString(temp));
        int n = 0;
        int[] countOfOne = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            long curr = temp[i];
            int count = 0;
            while (curr != 0)
            {
                long t = curr % 10;
                curr = curr / 10;
                if (t == 1)
                {
                    count += 1;
                }
            }
            countOfOne[i] = count;
        }
        System.out.println(Arrays.toString(countOfOne));

        for (int i = 0; i < countOfOne.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (countOfOne[j-1] > countOfOne[j])
                {
                    int t1 = countOfOne[j-1];
                    countOfOne[j-1] = countOfOne[j];
                    countOfOne[j] = t1;

                    int t2 = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t2;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1})));
    }
}
