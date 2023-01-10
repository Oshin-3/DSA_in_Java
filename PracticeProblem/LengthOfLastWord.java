package com.PracticeProblem;

import java.util.Arrays;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] temp = s.split(" ");
        int len = temp[temp.length-1].trim().length();

        return len;
    }

    public static void main(String[] args) {
        String s = "   luffy is still joyboy           ";

        System.out.println("Output: " + lengthOfLastWord(s));
    }
}
