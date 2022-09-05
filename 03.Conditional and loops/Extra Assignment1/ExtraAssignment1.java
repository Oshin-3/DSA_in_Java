import java.util.Scanner;

public class ExtraAssignment1 {
    //1. Factorial Program In Java
    public static void main(String[] args) {

        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num > 0)
        {
            fact *= num;
            num = num - 1;
        }

        System.out.println("Output: Factorial of the number = " + fact);
    }
}
