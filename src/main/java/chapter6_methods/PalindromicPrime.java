package chapter6_methods;


import chapter5_loops.DisplayPrimes;

/**
 * Displays the first 100 palindromic prime numbers
 */
public class PalindromicPrime
{
    public static void main(String[] args)
    {
        int count = 0;
        int i = 2;
        while (count < 100)
        {
            if (PalindromeInteger.isPalindrome(i) && DisplayPrimes.isPrime(i))
            {
                count++;
                if (count % 10 == 0)
                {
                    System.out.println(i);
                } else
                {
                    System.out.printf("%-5d ", i);
                }
            }
            i++;
        }
    }
}
