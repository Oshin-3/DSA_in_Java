package com.oshin;

import java.util.Scanner;

public class Assignment1 {

    //1. Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        System.out.println("'This program is to check whether the given number is even or odd'");
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println(num + " is an even number.");
        }
        else
        {
            System.out.println("Output: " + num + " is an odd number.");
        }
    }

}
