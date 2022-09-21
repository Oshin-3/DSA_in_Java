package com.oshin;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate area mentioned below\n");
        System.out.println("1. Area of Circle\n2. Area of Triangle\n3. Area of Rectangle\n4. Area Of Isosceles Triangle" +
                "\n5. Area Of Parallelogram\n6. Area Of Rhombus\n7. Area Of Equilateral Triangle");
        int num = sc.nextInt();

        switch (num)
        {
            case 1: AreaOfCircle.AreaOfCircle();
                    break;
            case 2: AreaOfTriangle.AreaOfTriangle();
                    break;
            case 3: AreaOfRectangle.AreaOfRectangle();
                    break;
            case 4: AreaOfIsoscelesTriangle.AreaOfIsoscelesTriangle();
                    break;
            case 5: AreaOfParallelogram.AreaOfParallelogram();
                    break;
            case 6: AreaOfRhombus.AreaOfRhombus();
                    break;
            case 7: AreaOfEquilateralTriangle.AreaOfEquilateralTriangle();
                    break;
            default:
                System.out.println("There was an error!");
        }
    }
}
