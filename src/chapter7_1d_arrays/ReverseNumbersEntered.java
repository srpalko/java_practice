package chapter7_1d_arrays;

import java.util.Scanner;

/**
 * Reads ten integers and displays them in the reverse
 * of the order in which they were read.
 */
public class ReverseNumbersEntered
{
    public static void main(String[] args)
    {
        int[] tenInts = readTenInts();
        displayInReverse(tenInts);
    }

    /**
     * Reads ten integers from the console
     * @return an array of ten integers
     */
    public static int[] readTenInts()
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        return array;
    }

    /**
     * Displays the elements of an int array
     * in reverse order.
     * @param array an array of ints
     */
    public static void displayInReverse(int[] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
    }
}
