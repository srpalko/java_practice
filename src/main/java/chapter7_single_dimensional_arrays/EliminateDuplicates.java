package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Reads ten integers, invokes the method, and displays the result.
 */
public class EliminateDuplicates
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] entry = new int[10];
        for (int i = 0, entryLength = entry.length; i < entryLength; i++)
        {
            entry[i] = input.nextInt();
        }

        int[] nonDupe = eliminateDuplicates(entry);
        System.out.print("The distinct numbers are: ");
        for (int num :
                nonDupe)
        {
            System.out.print(num + " ");
        }

    }

    /**
     * Returns a new array by eliminating the duplicate values in the array.
     * @param list array to be processed
     * @return array with duplicates removed
     */
    public static int[] eliminateDuplicates(int[] list)
    {
        int[] result = new int[list.length];
        int next = 0;
        for (int num : list)
        {
            boolean inList = false;
            for (int j : result)
            {
                if (j == num)
                {
                    inList = true;
                    break;
                }

            }
            if (!inList)
            {
                result[next] = num;
                next++;
            }
        }
        int[] trimmed = new int[next];
        for (int i = 0, trimmedLength = trimmed.length; i < trimmedLength; i++)
        {
            trimmed[i] = result[i];
        }
        return trimmed;
    }
}
