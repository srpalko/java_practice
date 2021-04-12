package chapter7_1d_arrays;

import java.util.Arrays;

/**
 * Randomly generates an array of 100,000 integers and a key. Estimates execution time of invoking the linearSearch
 * method. Sorts the array and estimates the execution time of invoking the binarySearch method.
 */
public class ExecutionTime
{
    public static void main(String[] args)
    {
        final int SIZE = 100_000_000;
        // Generate an array of SIZE random ints
        int[] randomInts = new int[SIZE];
        for (int i = 0, arrayLength = randomInts.length; i < arrayLength; i++)
        {
            randomInts[i] = (int) (Math.random() * SIZE);
        }

        // Generate a key
        int key = (int) (Math.random() * SIZE);

        // Time linear search
        long startLinear = System.currentTimeMillis();
        int location = linearSearch(randomInts, key);
        long endLinear = System.currentTimeMillis();
        long linearTime = endLinear - startLinear;
        System.out.println("Linear search took " +
                (linearTime) + " milliseconds to find " + key + " at index " + location);

        // Time sort
        long startSort = System.currentTimeMillis();
        Arrays.sort(randomInts);
        long endSort = System.currentTimeMillis();
        long sortTime = endSort - startSort;
        System.out.println("Sorting took " + (sortTime) + " milliseconds.");

        // Time binary search
        long startBinary = System.currentTimeMillis();
        location = binarySearch(randomInts, key);
        long endBinary = System.currentTimeMillis();
        long binaryTime = endBinary - startBinary;
        System.out.println("Binary search took " +
                (binaryTime) + " milliseconds to find " + key + " at index " + location);



    }

    public static int linearSearch(int[] list, int key)
    {
        for (int i = 0, listLength = list.length; i < listLength; i++)
        {
            int num = list[i];
            if (key == num)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;

        while (high >= low)
        {
            int mid = (low + high) / 2;
            if (key < list[mid])
            {
                high = mid - 1;
            } else if (key == list[mid])
            {
                return mid;
            } else
            {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
