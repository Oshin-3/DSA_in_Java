import java.util.Scanner;

public class ExtraAssignment25 {
    // 25. You are allowed to go out with your friends only on the even days of a given month.
    // Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args) {

        int noOfDays = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = sc.next();

        if(month.toLowerCase().equals("february"))
        {
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            {
                noOfDays = 29;
            }
            else
            {
                noOfDays = 28;
            }
        }
        else if(month.toLowerCase().equals("april") || month.toLowerCase().equals("june") || month.toLowerCase().equals("september")
                || month.toLowerCase().equals("november"))
        {
            noOfDays = 30;
        }
        else if (month.toLowerCase().equals("january") || month.toLowerCase().equals("march") || month.toLowerCase().equals("may") || month.toLowerCase().equals("july") ||
                month.toLowerCase().equals("august") || month.toLowerCase().equals("october") || month.toLowerCase().equals("december"))
        {
            noOfDays = 31;
        }
        else
        {
            System.out.println("Invalid entry!");
        }

        for (int i = 1; i <= noOfDays; i++)
        {
            if(i % 2 == 0)
                count = count + 1;
        }

        System.out.println("Output: Number of time you can go out with your friends in month of " + month + " = " + count);
    }


}
