package com.LeetCodePractice;

//https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {

    public static boolean isBadVersion(int version)
    {
        boolean[] arr = {false, false, false, true, true, true, true, true, true};

        return arr[version-1];
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid-1) == false && isBadVersion(mid) == true)
                return mid;
            if (isBadVersion(mid-1))
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int output = firstBadVersion(9);
        System.out.println("Output: " + output);
    }
}
