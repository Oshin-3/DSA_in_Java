package com.LeetCodePractice;

//https://leetcode.com/problems/valid-perfect-square/
public class PerfectSquare {

    public static boolean isPerfectSquare(int num) {

        int start = 1;
        int end = num;

        while (start <= end)
        {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;

            if(sq == num)
                return true;
            if (sq < num)
                start = (int) mid + 1;
            else
                end = (int) mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        boolean output = isPerfectSquare(1000);
        System.out.println("Output: " + output);
    }
}
