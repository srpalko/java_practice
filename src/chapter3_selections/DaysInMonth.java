package chapter3_selections;

import java.util.Scanner;

public class DaysInMonth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number and the year: ");
        int month = input.nextInt();
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int daysInMonth = 0;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = isLeapYear ? 29: 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
        }
        System.out.println("There are " + daysInMonth + " days in the month.");
    }
}
