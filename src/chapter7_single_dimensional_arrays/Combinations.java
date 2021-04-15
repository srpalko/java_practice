package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Prompts the user to enter 10 integers and displays all combinations of
 * picking two numbers from the 10.
 */
public class Combinations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++)
        {
            list[i] = input.nextInt();
        }

        int firstChoice;
        int secondChoice;

        // Possible combinations is Permutations / r!
        final int POSSIBLE_COMBINATIONS = (10 * 9) / 2;
        int count = 0;

        for (int i = 0; i < list.length; i++)
        {
            for (int j = i + 1; j < list.length; j++)
            {
                System.out.printf("(%d, %d)\n", list[i], list[j]);
                count++;
            }
        }
        System.out.println("Combinations " + count);
    }

}
