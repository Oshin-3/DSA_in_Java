package com.oshin;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void AreaOfRectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        float length = sc.nextFloat();
        System.out.print("Enter width: ");
        float width = sc.nextFloat();

        float area = length * width;
        System.out.println("Output: Area of Rectangle = " + area);
    }
}
