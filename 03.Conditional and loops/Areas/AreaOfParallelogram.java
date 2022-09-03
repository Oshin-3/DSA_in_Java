package com.oshin;

import java.util.Scanner;

public class AreaOfParallelogram {

    public static void AreaOfParallelogram()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length: ");
        float base = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        double area = base * height;
        System.out.println("Output: Area of Parallelogram = " + area);
    }
}
