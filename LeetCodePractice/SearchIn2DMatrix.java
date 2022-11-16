package com.LeetCodePractice;

//https://leetcode.com/problems/search-a-2d-matrix/description/
public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == target)
                return true;
            if(matrix[row][col] > target)
                col--;
            else
                row++;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3));
    }
}
