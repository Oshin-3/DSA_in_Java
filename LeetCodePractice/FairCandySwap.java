package com.LeetCodePractice;

import java.util.Arrays;

//https://leetcode.com/problems/fair-candy-swap/
public class FairCandySwap {

    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return target;
        }

        return -1;
    }


    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

      int aliceSum = 0;
      int bobSum = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            aliceSum += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            bobSum += bobSizes[i];
        }

        for (int i = 0; i < aliceSizes.length; i++) {
            int x = aliceSizes[i];
            int y = ((bobSum - aliceSum) + (2 * x)) / 2;

            if(linearSearch(bobSizes, y) != -1)
                return new int[]{x, y};
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
