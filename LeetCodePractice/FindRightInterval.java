package com.LeetCodePractice;

import java.util.Arrays;

public class FindRightInterval {

    public static int[] findRightInterval(int[][] intervals) {
        int[] temp = new int[intervals.length];
        // initialize temp to -1
        for (int i = 0; i < temp.length; i++) {
            temp[i] = -1;
        }

        int row = 0;

        while (row < intervals.length)
        {
            int value = -1;
            int end = intervals[row][1];
            for (int i = 0; i < intervals.length; i++) {
                if (intervals[i][0] >= end)
                {
                    temp[row] = i;
                }
            }

            row++;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] output = findRightInterval(new int[][]{{3,4},{2,3},{1,2}});
        System.out.println("Output: " + Arrays.toString(output));

    }
}
