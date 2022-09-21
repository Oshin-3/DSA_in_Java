package com.oshin;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void AreaOfEquilateralTriangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side length: ");
        float side1 = sc.nextFloat();
        System.out.print("Enter 2nd side length: ");
        float side2 = sc.nextFloat();
        System.out.print("Enter base length: ");
        float base = sc.nextFloat();

        if (side1 == side2  && side2 == base && base == side1)
        {
            float height_sq = (side1 * side1) - ((base * base)/4);
            if (height_sq < 0)
            {
                height_sq = (-1) * height_sq;
            }
            double area = (base * Math.sqrt(height_sq)) / 2;
            System.out.printf("Output: Area of Equilateral Triangle = %.2f\n", area);
        }
        else
        {
            System.out.println("Input provided shows that it is not an Equilateral Triangle.");
        }
    }
}
