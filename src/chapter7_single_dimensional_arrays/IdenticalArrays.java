package chapter7_single_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Two lists are identical if they have the same contents.
 * Method for determining identical arrays.
 * Test program that prompts the user to enter two lists of integers and
 * displays whether the two are identical. The first number in the input
 * indicates the number of the elements in the list. This number is not
 * part of the list.
 */
public class IdenticalArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list 1 (first number is size of array): ");
        int size = input.nextInt();
        int[] list1 = new int[size];
        for (int i = 0; i < size; i++)
        {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list 2 (first number is size of array): ");
        size = input.nextInt();
        int[] list2 = new int[size];
        for (int i = 0; i < size; i++)
        {
            list2[i] = input.nextInt();
        }

        boolean isIdentical = equals(list1, list2);

        if (isIdentical)
        {
            System.out.println("Two lists are identical");
        }
        else
        {
            System.out.println("Two lists are not identical");
        }
    }

    /**
     * Checks if two arrays are identical
     * @param list1 first array to check
     * @param list2 second array to check
     * @return true if arrays are identical
     */
    public static boolean equals(int[] list1, int[] list2)
    {
        if (list1.length != list2.length)
        {
            return false;
        }

        // Copy the arrays and sort the contents
        int[] sorted1 = list1.clone();
        Arrays.sort(sorted1);
        int[] sorted2 = list2.clone();
        Arrays.sort(sorted2);

        // Check for equality
        for (int i = 0; i < list1.length; i++)
        {
            if (sorted1[i] != sorted2[i])
            {
                return false;
            }
        }
        return true;
    }
}
