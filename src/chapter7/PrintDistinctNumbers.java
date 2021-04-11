package chapter7;

import java.util.Scanner;

/**
 * Reads in ten numbers and displays the number of distinct numbers and the distinct numbers separated by exactly
 * one space (i.e., if a number appears multiple times, it is displayed only once).
 */
public class PrintDistinctNumbers
{
    public static void main(String[] args)
    {
        int[] numbers = getInput();
        displayResult(numbers);
    }

    /**
     * Reads ten integers from the console and stores them in an array.
     * @return an array of ten ints
     */
    public static int[] getInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
        {
            int next = input.nextInt();
            if (!contains(next, numbers))
            {
                numbers[i] = next;
            }
        }
        return numbers;
    }

    public static boolean contains(int num, int[] array)
    {
        for (int j : array)
        {
            if (j == num)
            {
                return true;
            }
        }
        return false;
    }

    public static void displayResult(int[] array)
    {
        int count = countDistinct(array);
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int number :
                array)
        {
            if (number > 0)
            {
                System.out.print(number + " ");
            }

        }
    }

    public static int countDistinct(int[] arr)
    {
        int count = 0;
        for (int num :
                arr)
        {
            if (num > 0)
            {
                count++;
            }
        }
        return count;
    }

}
