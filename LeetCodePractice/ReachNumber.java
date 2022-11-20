package com.LeetCodePractice;

public class ReachNumber {


    public static int reachNumber(int target) {
        int end = 1;
        int numMoves = 0;

        while (end != target)
        {
            numMoves++;
            int sum = end + numMoves;
            if (target >= sum)
                end += numMoves;
            else
                end -= numMoves;
        }

        return numMoves;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + reachNumber(-1));

    }
}
