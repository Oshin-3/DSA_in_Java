package com.LeetCodePractice;

import java.util.Arrays;

public class AllCellsDistOrder {

    public static void insertionSort(int[][] temp, int[] tempDiff)
    {
        for (int i = 0; i < tempDiff.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (tempDiff[j-1] > tempDiff[j])
                {
                    int t = tempDiff[j-1];
                    tempDiff[j-1] = tempDiff[j];
                    tempDiff[j] = t;

                    int[] t2 = temp[j-1];
                    temp[j-1] = temp[j];
                    temp[j] = t2;
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] temp = new int[rows*cols][2];
        int[] tempDiff = new int[rows*cols];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            int rDis = Math.abs(rCenter - i);
            for (int j = 0; j < cols; j++) {
                int cDis = Math.abs(cCenter - j);
                temp[k][0] = i;
                temp[k][1] = j;
                tempDiff[k] = rDis + cDis;
                k++;
            }
        }

        insertionSort(temp, tempDiff);

//        System.out.println(Arrays.toString(tempDiff));
//        for (int i = 0; i < temp.length; i++) {
//            System.out.print("[");
//            for (int j = 0; j < temp[i].length; j++) {
//                int[] f = temp[i];
//                System.out.print(temp[i][j]);
//
//            }
//            System.out.print("]");
//        }

        return temp;
    }

    public static void main(String[] args) {
        int[][] output  = allCellsDistOrder(2,2, 0, 1);
    }
}
