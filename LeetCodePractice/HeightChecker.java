package com.LeetCodePractice;

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {

        int [] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++)
        {
            expected[i] = heights[i];
        }

        Arrays.sort(expected);
        int count = 0;

        for (int i = 0; i < heights.length; i++)
        {
            if (heights[i] != expected[i])
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
