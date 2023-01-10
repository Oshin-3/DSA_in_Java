package com.PracticeProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 48 && s.charAt(i) <= 57)
            {
                temp.append(s.charAt(i));
            }
        }

        int start = 0;
        int end = temp.length()-1;

        while (start < end)
        {
            if (temp.charAt(start) == temp.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        //s = s.toLowerCase();

        System.out.println(isPalindrome(s));
//        String[] splitS = s.split(" ");
//        System.out.println(Arrays.toString(splitS));
//        System.out.println(s);

    }
}
