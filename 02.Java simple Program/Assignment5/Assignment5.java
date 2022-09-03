package com.oshin;

import java.util.Scanner;

public class Assignment5 {
    // 5. Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("Largest number is = " + num1);
        }
        else
        {
            System.out.println("Largest number is = " + num2);
        }
    }


}
