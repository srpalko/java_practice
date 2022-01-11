package chapter3_selections;

import java.util.Scanner;

public class FindFutureDates
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfDays = input.nextInt();
        int futureDay = (today + numberOfDays) % 7;
        System.out.println("Today is " + dayOfWeek(today) + " and the future day is " + dayOfWeek(futureDay));

    }

    public static String dayOfWeek(int dayNumber)
    {
        String day;
        switch (dayNumber)
        {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Error!";
        }
        return day;
    }
}
