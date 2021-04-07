package chapter5;

import java.util.Scanner;

/**
 * Reads integers, finds the largest of them, and
 * counts its occurrences.
 */
public class OccurrenceOfMaxNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers (0 to end): ");

        int max = Integer.MIN_VALUE;
        int count = 1;
        while (true)
        {
            int next = input.nextInt();
            if (next == 0)
            {
                break;
            }
            if (next > max)
            {
                max = next;
                count = 1;
            } else if (next == max)
            {
                count++;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
