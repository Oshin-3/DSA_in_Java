package com.LeetCodePractice;

//https://leetcode.com/problems/sqrtx/
public class Sqrt {
    public static int mySqrt(int x) {
        //using binary search approach
        //find the range
        int start = 1;
        int end = x;

        while (start <= end)
        {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;

            if(sq == x)
                return (int) mid;
            if (sq < x)
                start = (int) mid + 1;
            else
                end = (int) mid - 1;
        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + mySqrt(2147395599));
    }
}
