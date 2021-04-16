package chapter8_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Displays employees and their total hours in decreasing order of the total hours.
 */
public class ComputeWklyHrsForEachEmployee
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] employeeDailyHours = new int[8][7];

        for (int i = 0; i < employeeDailyHours.length; i++)
        {
            for (int j = 0; j < employeeDailyHours[i].length; j++)
            {
                employeeDailyHours[i][j] = input.nextInt();
            }
        }

        int[] sums = new int[employeeDailyHours.length];

        for (int i = 0; i < employeeDailyHours.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < employeeDailyHours[i].length; j++)
            {
                sum += employeeDailyHours[i][j];
            }
            sums[i] = sum;
        }

        final int HOURS_IN_WEEK = 24 * 7;

        for (int i = 0; i <= HOURS_IN_WEEK; i++)
        {
            for (int j = 0; j < sums.length; j++)
            {
                if (sums[j] == i)
                {
                    System.out.println("Employee " + j + " worked for " + i + " hours this week.");
                }
            }
        }
    }




}
