package com.LeetCodePractice;

import java.util.Arrays;

//https://leetcode.com/problems/fair-candy-swap/
public class FairCandySwap {

    public static int sum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }


    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int start = sum(aliceSizes);
        int end = sum(bobSizes);
        int i = 0, j = 0;
        while (i <= aliceSizes.length || j <= bobSizes.length)
        {
            int mid = start + (end - start) / 2;
            int aTemp = aliceSizes[i];
            int bTemp = bobSizes[j];
            // swap
            aliceSizes[i] = bTemp;
            bobSizes[j] = aTemp;

            if(sum(aliceSizes) == mid && sum(bobSizes) == mid)
                return new int[]{aTemp, bTemp};
            else
            {
                // swap
                aliceSizes[i] = aTemp;
                bobSizes[j] = bTemp;
            }

            if (aliceSizes.length > 1 && aliceSizes.length >= i)
                i++;
            if (bobSizes.length > 1 && bobSizes.length >= j)
                j++;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] aliceSizes = {1,2,5};
        int[] bobSizes = {2,4};
        int[] output = fairCandySwap(aliceSizes, bobSizes);
        System.out.println("Output: " + Arrays.toString(output));
    }
}
