package chapter7_1d_arrays;

import java.util.Scanner;

public class IsSorted
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list (first number indicates length of input): ");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
        {
            array[i] = input.nextInt();
        }
        String message = isSorted(array) ? "already" : "not";
        System.out.println("The list is " + message + " sorted");
    }

    /**
     * Returns true if the list is already sorted.
     * @param list list to check
     * @return true if sorted
     */
    public static boolean isSorted(int[] list)
    {
        // Iterate throught the loop.
        for (int i = 0, len = list.length; i < len - 1; i++)
        {
            if (list[i] > list[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
