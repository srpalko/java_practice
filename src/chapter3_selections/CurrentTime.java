package chapter3_selections;

import java.util.Scanner;

/**
 * Prompt user for time zone and display time in a 12-hour clock format
 */
public class CurrentTime
{
    public static void main(String[] args)
    {
        // Get info from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours % 24) + offset;

        // Determine AM/PM
        String amOrPm = currentHour < 12 ? "AM" : "PM";

        // Convert to 12-hour format
        long current12Hour = currentHour % 12;

        // Display results in a nice format
        System.out.printf("Current time is %d:%02d:%02d %s", current12Hour, currentMinute, currentSecond, amOrPm);
    }
}
