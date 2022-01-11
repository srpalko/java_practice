package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Reads the integers between 1 and 100 and
 * counts the occurrences of each. Assumes
 * the input ends with 0.
 */
public class CountOccurrenceOfNumbers
{
    public static void main(String[] args)
    {
        int[] counts = getIntegerCounts();
        displayOccurrences(counts);
    }

    public static int[] getIntegerCounts()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] counts = new int[101];
        while (true)
        {
            int next = input.nextInt();
            if (next == 0)
            {
                break;
            }
            counts[next]++;
        }
        return counts;
    }

    public static void displayOccurrences(int[] count)
    {
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] > 0)
            {
                String times = count[i] == 1 ? "time" : "times";
                System.out.println(i + " occurs " + count[i] + " " + times);
            }

        }
    }
}
