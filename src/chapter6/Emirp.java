package chapter6;

import chapter5.DisplayPrimes;

/**
 * Displays the first 100 Emirps (prime numbers that are
 * not palindromes but are still prime when their digits
 * are reversed.
 */
public class Emirp
{
    public static void main(String[] args)
    {
        int count = 0;
        int i = 2;
        while (count < 100)
        {
            if (!PalindromeInteger.isPalindrome(i) && DisplayPrimes.isPrime(i) && DisplayPrimes.isPrime(reverse(i)))
            {
                count++;
                if (count % 10 == 0)
                {
                    System.out.println(i);
                } else
                {
                    System.out.print(i + " ");
                }
            }
            i++;
        }
    }

    public static int reverse(int number)
    {
        StringBuilder reverse = new StringBuilder();
        reverse.append(number);
        reverse.reverse();
        return Integer.parseInt(reverse.toString());
    }
}
