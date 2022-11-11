package com.LeetCodePractice;

public class ArrangingCoins {

    public static int arrangeCoins(int n) {

        if (n <= 1) {
            return n;
        }
        if (n <= 3) {
            return n == 3 ? 2 : 1;
        }

        long start = 2;
        long end = n / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;
            if (coinsFilled == n) {
                return (int) mid;
            }
            if (coinsFilled < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Since at this point start > end, start will start pointing to a value greater
        // than the desired result. We will return end as it will point to the correct
        // int value.
        return (int) end;
    }

    public static void main(String[] args) {
        int output = arrangeCoins(1681692777);
        System.out.println("Output: " + output);
    }
}
