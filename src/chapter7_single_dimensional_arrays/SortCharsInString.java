package chapter7_single_dimensional_arrays;

import java.util.Scanner;

/**
 * Prompts a user to enter a string and displays the sorted string
 */
public class SortCharsInString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();
        String sorted = sort(entry);
        System.out.println(sorted);
    }


    /**
     * Returns a sorted string
     * @param s string to be sorted
     * @return sorted string
     */
    public static String sort(String s)
    {
        char[] charsFromString = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            charsFromString[i] = s.charAt(i);
        }
        bubbleSort(charsFromString);
        StringBuilder sortedString = new StringBuilder();
        for (char item :
                charsFromString)
        {
            sortedString.append(item);
        }
        return sortedString.toString();
    }

    public static void bubbleSort(char[] array)
    {
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0, length = array.length; i < length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
