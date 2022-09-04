import java.util.Scanner;

public class Assignment22 {
    // 22. Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        System.out.print("Enter number: ");
        String num = sc.next();

        for (int i = 0; i < num.length(); i++)
        {
            sum = sum + Integer.parseInt(String.valueOf(num.charAt(i)));
            product = product * Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        int subtract = product - sum;

        System.out.println("Output: Subtraction of product and sum of the digits = " + subtract);

    }
}
