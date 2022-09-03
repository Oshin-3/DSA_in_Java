package com.oshin;

import java.util.Scanner;

public class Assignment9 {
    // 9. To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean flag = false;
        System.out.print("Enter 1st number: ");
        String num1 = sc.next();
        System.out.print("Enter 2nd number: ");
        String num2 = sc.next();

        if(ArmstrongNumber(num1) && ArmstrongNumber(num2))
        {
            System.out.println("Both the numbers are Armstrong Number.");
        }
        else if (ArmstrongNumber(num1))
        {
            System.out.println(num1 + " is Armstrong Number.");
        }
        else if (ArmstrongNumber(num2))
        {
            System.out.println(num2 + " is Armstrong Number.");
        }
        else
        {
            System.out.println("Both the numbers are not Armstrong Number.");
        }

    }

    public static boolean ArmstrongNumber(String num)
    {
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i< num.length(); i++)
        {
            int j = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum = sum + (j*j*j);
        }

        if(sum == Integer.parseInt(num))
            return true;

        return flag;
    }
}
