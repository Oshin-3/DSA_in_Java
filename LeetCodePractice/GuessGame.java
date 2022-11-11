package com.LeetCodePractice;

//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class GuessGame {

    public int guess(int val)
    {
        return 0;
    }


    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(guess(mid) == -1)
            {
                //check LHS
                end = mid - 1;
            }
            if(guess(mid) == 1)
            {
                //check RHS
                start = mid + 1;
            }
            if(guess(mid) == 0)
                return mid;
        }

        return -1;
    }
}
