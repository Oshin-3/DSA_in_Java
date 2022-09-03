package com.oshin;

import java.util.Scanner;

public class Assignment7 {
    // 7. To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci Series starts with 0 and 1\n");
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + ", " + num2);
        for (int i = 0; i < n-2; i++)
        {
            sum = num1 +  num2;
            System.out.print(", " + sum);
            num1 = num2;
            num2 = sum;
        }

    }
}
