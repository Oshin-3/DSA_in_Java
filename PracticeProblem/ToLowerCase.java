package com.PracticeProblem;

public class ToLowerCase {

    public static String toLowerCase(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
            {
                char temp = (char) (s.charAt(i) + 32);
                s = s.replace(s.charAt(i), temp);
            }
        }

        return s;
    }

    public static void main(String[] args) {
       System.out.println("Output: " + toLowerCase("here"));
//        String hello = "Hello";
//        hello = hello.replace('H', 'h');
//        System.out.println(hello);
//        hello = hello.replace('l', 'L');
//        System.out.println(hello);

    }
}
