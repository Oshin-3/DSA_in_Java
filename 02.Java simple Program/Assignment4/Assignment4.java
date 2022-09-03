package com.oshin;

import java.util.Scanner;

public class Assignment4 {
    //4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter operator:\n1.Addition\t2.Subtraction\t3.Multiplication\t4.Division\n");
        int op = sc.nextInt();

        if(op == 1)
        {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (op == 2) {
            int sub = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + sub);
        } else if (op == 3) {
            int mul = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + mul);
        }else if(op == 4){
            int div = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + div);
        }
        else {
            System.out.println("There was some error.");
        }
    }
}
