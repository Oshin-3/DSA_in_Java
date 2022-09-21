package com.oshin;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void AreaOfTriangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length: ");
        float base = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float area = (base * height) / 2;
        System.out.println("Output: Area of Triangle = " + area);
    }
}
