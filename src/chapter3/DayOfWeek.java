package chapter3;

import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();
        if (month == 1 || month == 2)
        {
            month += 12;
            year -= 1;
        }
        int century = year / 100;
        int yearOfCentury = year % 100;
        int weekDay = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury
                            + (yearOfCentury / 4) + (century / 4) + (5 * century) ) % 7;
        System.out.println("Day of the week is " + dayOfWeekForFormula(weekDay));
    }

    public static String dayOfWeekForFormula(int dayNumber)
    {
        String day;
        switch (dayNumber)
        {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 0:
                day = "Saturday";
                break;
            default:
                day = "Error!";
        }
        return day;
    }


}
