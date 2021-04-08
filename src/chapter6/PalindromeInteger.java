package chapter6;

import java.util.Scanner;

/**
 * Methods for reversing a number and
 * checking if a number is a palindrome.
 */
public class PalindromeInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number))
        {
            System.out.println("This number is a palindrome.");
        } else
        {
            System.out.println("This number is not a palindrome.");
        }
    }

    /**
     * Reverses an integer
     * @param number a number to reverse
     * @return the number, reversed
     */
    public static int reverse(int number)
    {
        StringBuilder reversedNumber = new StringBuilder();
        while (number > 0)
        {
            int digit = number % 10;
            reversedNumber.append(digit);
            number /= 10;
        }
        return Integer.parseInt(reversedNumber.toString());
    }

    /**
     * Checks if a number is a palindrome
     * @param number a number to check
     * @return true if the number is a palindrome
     */
    public static boolean isPalindrome(int number)
    {
        return number == reverse(number);
    }
}
