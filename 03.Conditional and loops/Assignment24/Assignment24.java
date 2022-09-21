import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        //23. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner sc = new Scanner(System.in);
        System.out.println("'Enter 0 to exit'");
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0)
        {
            sum += num;
            num = sc.nextInt();
        }

        System.out.println("Output: Sum of all numbers = " + sum);
    }
}
