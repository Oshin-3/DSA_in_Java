package com.PracticeProblem;

public class DefangIPaddr {

    public static String defangIPaddr(String address) {

        String ans = "";

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
            {
                ans += "[" + address.charAt(i) + "]";

            }
            else
            {
                ans += address.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "255.100.50.0";
        System.out.println("Output: " + defangIPaddr(s));

    }
}
