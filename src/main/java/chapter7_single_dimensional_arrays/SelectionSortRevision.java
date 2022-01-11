package chapter7_single_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Revision of selection sort that works in the reverse of the usual implementation. This one finds the largest
 * element in the array and swaps it with the last element.
 */
public class SelectionSortRevision
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        selectionSortRev(array);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }


    public static void selectionSortRev(double[] list)
    {
        for (int i = list.length - 1; i >= 0; i--)
        {
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--)
            {
                if (currentMax < list[j])
                {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i)
            {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
