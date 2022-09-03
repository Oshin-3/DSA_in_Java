package com.oshin;

import java.util.Scanner;

public class AreaOfRhombus {
    //using diagonals as an input
    public static void AreaOfRhombus()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of 1st diagonal: ");
        float d1 = sc.nextFloat();
        System.out.print("Enter length of 2nd diagonal: ");
        float d2 = sc.nextFloat();

        double area = (d1 * d2) / 2;
        System.out.println("Output: Area of Rhombus = " + area);
    }
}
