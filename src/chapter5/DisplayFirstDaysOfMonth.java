package chapter5;

import java.util.Scanner;

import static chapter3.DayOfWeek.*;
/**
 * Takes the year and first day of the year and
 * displays the first day of each month.
 */
public class DisplayFirstDaysOfMonth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        for (int month = 1; month <= 12; month++)
        {
            int weekday = dayOfWeek(year, month, 1);
            String monthString = monthName(month);
            System.out.println(monthString + " 1, " + year + " is " + dayOfWeekForFormula(weekday));
        }

    }

    private static String monthName(int month)
    {
        String name;

        switch (month)
        {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
            default:
                name = "Error!";
        }
        return name;
    }
}
