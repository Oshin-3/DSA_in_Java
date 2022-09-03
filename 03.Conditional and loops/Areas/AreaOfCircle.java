package com.oshin;

import java.util.Scanner;

public class AreaOfCircle {

    public static void AreaOfCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();

        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println("Output: Area of circle = " + area);
    }

}
