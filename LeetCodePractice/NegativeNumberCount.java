package com.LeetCodePractice;


//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class NegativeNumberCount {

    public static int countNegatives(int[][] grid) {
        int r = 0;
        int c = grid[0].length-1;
        int count = 0;

        while (r < grid.length && c >= 0)
        {
            if(grid[r][c] < 0)
                count++;

            if(c > 0 && grid[r][c-1] < 0 )
            {
                c--;
            }
            else
            {
                r++;
                c = grid[0].length-1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + countNegatives(new int[][]{{5,1,0},{-5,-5,-5}}));
    }
}
