package com.SearchIn2DArray;

import java.util.Arrays;

//Here matrix is sorted row and column wise
public class BinarySearchInSorted2DArray {

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
                return new int[]{row,mid};
            else if (target > matrix[row][mid])
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }

        return new int[]{-1,-1};
    }

    public static int[] BinarySearchInSortedMatrix(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1)
            binarySearch(matrix, 0, 0, cols-1, target);

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while (rStart < (rEnd-1))
        {
            int mid = rStart + (rEnd - rStart) /2;
            if(matrix[mid][cMid] == target)
                return new int[]{mid, cMid};
            if(matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }


    public static int[] search(int[][] matrix, int target)
    {
        // we have to know the start and end for this sorted matrix
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length && c >= 0)
        {
            if(matrix[r][c] == target)
                return new int[]{r, c};
            if(matrix[r][c] < target)
                r++;
            else
                c--;
        }

        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
        int[] output = search(matrix, 70);
        System.out.println("Output: " + Arrays.toString(output));

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(BinarySearchInSortedMatrix(arr,6)));
    }
}
