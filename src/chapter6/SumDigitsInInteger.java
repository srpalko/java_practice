package chapter6;

import java.util.Scanner;

/**
 * Computes the sum of the digits of an integer.
 */
public class SumDigitsInInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer up to " + Long.MAX_VALUE + ": ");
        long number = input.nextLong();
        int sum = sumDigits(number);
        System.out.println("The sum of the digits is " + sum);
    }

    public static int sumDigits(long n)
    {
        int sum = 0;
        while (n > 0)
        {
            long digit = n % 10;
            sum+= digit;
            n /= 10;
        }
        return sum;
    }
}
