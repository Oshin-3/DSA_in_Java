package com.oshin;

import java.util.Scanner;

public class Assignment8 {
    // 8. To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = sc.nextLine();
        String revInput = "";

        int len = input.length();
        for (int i = len-1; i >= 0; i--)
        {
            char c = input.charAt(i);
            revInput = revInput + c;
        }
        //System.out.println(revInput);
        if(input.equals(revInput))
        {
            System.out.println("This is a Palindrome");
        }
        else
        {
            System.out.println("This is not a Palindrome");
        }

    }
}
