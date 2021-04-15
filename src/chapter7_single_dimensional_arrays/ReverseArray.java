package chapter7_single_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Rewrite of an array reversing method.
 * The original used a new array and copied the elements
 * from back to front. This one reversed in place.
 */
public class ReverseArray
{
    public static void main(String[] args)
    {
        // test
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        int length = numbers.length;
        for (int i = 0; i < length; i++)
        {
            numbers[i] = input.nextInt();
        }

        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverseArray(int[] arr)
    {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
