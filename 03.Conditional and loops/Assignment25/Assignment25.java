import java.util.Scanner;

public class Assignment25 {
    public static void main(String[] args) {
        // 25. Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner sc = new Scanner(System.in);
        System.out.println("'Enter 0 to exit'");
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int largest = 0;

        while (num != 0)
        {
            int temp = num;
            num = sc.nextInt();
            if(temp > num && temp > largest)
            {
                largest = temp;
            }
            else if (num >largest)
            {
                largest = num;
            }
        }

        System.out.println("Output: Largest number = " + largest);
    }
}
