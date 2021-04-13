package chapter7_1d_arrays;

import java.util.Scanner;

/**
 * Arrays are strictly identical if their corresponding elements are equal.
 * Method for determining strict equality and test program that prompts
 * the user to enter two lists of integers and displays whether the two
 * are strictly identical.
 * First number in the input indicates the number of the elements in the list.
 * This number is not part of the list.
 */
public class StrictlyIdenticalArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list 1 (first number is list size): ");
        int size = input.nextInt();
        int[] list1 = new int[size];
        for (int i = 0; i < size; i++)
        {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list 2 (first number is list size): ");
        size = input.nextInt();
        int[] list2 = new int[size];
        for (int i = 0; i < size; i++)
        {
            list2[i] = input.nextInt();
        }

        // Determine equality
        boolean isStrictlyEqual = equals(list1, list2);

        if (isStrictlyEqual)
        {
            System.out.println("Two lists are strictly identical");
        } else
        {
            System.out.println("Two lists are not strictly identical");
        }
    }

    /**
     * Checks for strict equality between arrays
     * @param list1 first array to check
     * @param list2 second array to check
     * @return true if strictly equal
     */
    public static boolean equals(int[] list1, int[] list2)
    {
        if (list1.length != list2.length)
        {
            return false;
        }
        for (int i = 0, length = list1.length; i < length; i++)
        {
            if (list1[i] != list2[i])
            {
                return false;
            }
        }
        return true;
    }
}
