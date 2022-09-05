import java.util.Scanner;

public class ExtraAssignment26 {
    //26. Write a program to print the sum of negative numbers, sum of positive even numbers and the
    // sum of positive odd numbers from a list of numbers (N) entered by the user.
    // The list terminates when the user enters a zero.

    public static void main(String[] args) {

        int sum_even = 0;
        int sum_odd = 0;
        int sum_neg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("'Enter 0 to exit'");
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        while (num != 0)
        {
            //print sum of negative numbers
            if(num < 0)
                sum_neg += num;
            else if (num >= 0 && num % 2 == 0) //sum of positive even numbers
                sum_even += num;
            else
                sum_odd += num; //sum of positive odd numbers

            num = sc.nextInt();
        }

        System.out.println("Output:" );
        System.out.print("Sum of negative numbers = " + sum_neg);
        System.out.print("\nSum of positive even numbers = " + sum_even);
        System.out.print("\nSum of positive odd numbers = " + sum_odd);

    }
}
