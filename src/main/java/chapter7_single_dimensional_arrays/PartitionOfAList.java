package chapter7_single_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Prompts the user to enter the size of the list and the contents of
 * the list and displays the list after the partition.
 */
public class PartitionOfAList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.print("Enter list content: ");
        for (int i = 0; i < size; i++)
        {
            list[i] = input.nextInt();
        }
        int pivotLocation = partition(list);
        System.out.println("After the partition, the list is " + Arrays.toString(list));
    }


    /**
     * Partitions a list using the first element, called a pivot.
     * After the partition, the elements in the list are rearranged so all of the
     * elements before the pivot are less than or equal to the pivot, and the elements
     * after the pivot are greater than the pivot. The method returns the index where the
     * pivot is located in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}.
     * After the partition, the list becomes {3, 2, 5, 9, 6, 8}. This method is implemented
     * in a way that takes at most list.length comparisons.
     * @param list array to be partitioned
     * @return int representing the index of the pivot in the altered array.
     */
    public static int partition(int[] list)
    {
        // The pivot is the first element
        int pivot = list[0];
        int pivotIndex = 0;

        /*Set i to the last element in the array. Set j to the lowest index that has a value
        * greater than pivot.*/
        int i = list.length - 1;
        int j = 1;
        while (i > j)
        {
            /*Move j to the next index that contains an element larger than pivot*/
            if (list[j] <= pivot)
            {
                j++;
                continue;
            }
            /*If element at i is less than or equal to the pivot, swap with j and
            * move i to the left.*/
            if (list[i] <= pivot)
            {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i--;
            }
            /*If element at i is greater than pivot, move i to the left.*/
            else
            {
                i--;
            }
        }
        /*After the loop exits, i is the proper location for the pivot*/
        int temp = list[i];
        list[i] = pivot;
        list[0] = temp;
        return i;
    }
}
