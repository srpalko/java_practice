package chapter7_single_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Prompts the user to enter two sorted lists and displays the merged list.
 * Note the first number in the input indicates the number of elements in the list.
 * This number is not part of the list.
 */
public class MergeTwoSortedLists
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++)
        {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++)
        {
            list2[i] = input.nextInt();
        }
        System.out.println("List 1 is " + Arrays.toString(list1));
        System.out.println("list 2 is " + Arrays.toString(list2));
        int[] mergedArray = merge(list1, list2);
        System.out.println("The merged list is " + Arrays.toString(mergedArray));
    }


    /**
     * Merges two sorted lists into a new sorted list
     * Uses at most list1.length + list2.length comparisons
     *
     * @param list1 first list
     * @param list2 second list
     * @return new sorted merged list
     */
    public static int[] merge(int[] list1, int[] list2)
    {
        // Create a new array with space for all values
        int[] mergedList = new int[list1.length + list2.length];

        int index1 = 0;
        int index2 = 0; // These keep the place in the arrays to be sorted
        for (int i = 0; i < mergedList.length; i++)
        {

            /*
            * If the index of one of the arrays has exceeded the legal bounds,
            * that array has provided all of its elements. Proceed to only add elements
            * from the other array.
            * */
            if (index2 == list2.length)
            {
                mergedList[i] = list1[index1];
                if (index1 < list1.length - 1)
                {
                    index1++;
                }
            }
            else if (index1 == list1.length)
            {
                mergedList[i] = list2[index2];
                if (index2 < list2.length - 1)
                {
                    index2++;
                }
            }
            /*Pick the element that is smaller, add it to the merged array
            * and increment the index for that array.*/
            else if (list1[index1] < list2[index2])
            {
                mergedList[i] = list1[index1];
                index1++;
            }
            else
            {
                mergedList[i] = list2[index2];
                index2++;
            }
        }
        return mergedList;
    }
}
