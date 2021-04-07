package chapter5;

import java.util.Scanner;

import static chapter3.DayOfWeek.*;
import static chapter5.DisplayFirstDaysOfMonth.monthName;
import static chapter4.DaysOfAMonth.daysInMonth;
/**
 * Takes a year and displays the calendar tables for the year.
 */
public class DisplayCalendar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        for (int month = 1; month <= 12; month++)
        {
            int firstDay = dayOfWeek(year, month, 1);
            int numDays = daysInMonth(year, month);
            int day = 1;
            System.out.printf("%25s %d\n", monthName(month), year);
            System.out.println("--------------------------------------------------");
            System.out.println(" Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            for (int col = 1; col <= 36; col++)
            {
                if (col < firstDay)
                {
                    System.out.print("       ");
                } else if (col % 7 == 0 && day <= numDays)
                {
                    System.out.println(" " + day);
                    day++;
                } else if (day <= numDays)
                {
                    System.out.printf(" %-6d", day);
                    day++;
                }
            }
            System.out.println("\n");
        }
    }
}
