package com.oshin;

import java.util.Scanner;

public class Assignment3 {
    //3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        long p = sc.nextLong();

        System.out.print("Enter Time(in Years): ");
        int t = sc.nextInt();

        System.out.print("Enter Rate of Interest(in %): ");
        int r = sc.nextInt();

        long si = (p * t * r)/100;

        System.out.println("\nSimple Interest = " + si);
    }
}
