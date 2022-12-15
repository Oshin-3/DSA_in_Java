package com.LeetCodePractice;

import java.util.Arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        for (int i = 0; i < s.length; i++) {
           if (j < g.length && s[i] >= g[j])
               j++;
        }

        return j;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }
}
