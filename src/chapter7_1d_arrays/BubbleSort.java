package chapter7_1d_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
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
        bubbleSort(array);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(double[] array)
    {
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0, length = array.length; i < length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
