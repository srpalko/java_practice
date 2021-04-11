package chapter7;

import java.util.Scanner;

/**
 * Prompts user to enter five numbers, invokes the method to find the gcd of the numbers, and
 * displays the gcd.
 */
public class ComputeGCD
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        int gcd = gcd(array);
        System.out.println("The greatest common denominator is " + gcd);
    }

    /**
     * Returns the gcd of an unspecified number of integers
     * @param numbers numbers to check
     * @return the greatest common denominator of the numbers
     */
    public static int gcd(int... numbers)
    {
        int gcd = 0;
        boolean gcdFound = false;
        int smallestElement = FindSmallestElement.min(numbers);
        for (int i = smallestElement; i >= 1; i--)
        {
            if (gcdFound)
            {
                break;
            }
            for (int num :
                    numbers)
            {
                if (num % i != 0)
                {
                    gcdFound = false;
                    break;
                }
                gcd = i;
                gcdFound = true;
            }
        }
        return gcd;
    }
}
