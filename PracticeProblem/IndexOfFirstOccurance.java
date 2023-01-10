package com.PracticeProblem;

public class IndexOfFirstOccurance {

    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();

        for (int i = 0; i <= len1 - len2; i++) {
            int j = 0;
            for (j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }

            if (j == len2)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String needle = "but";
        String haystack = "sadbutsad";

        System.out.println("Output: " + strStr(haystack, needle));
    }
}
