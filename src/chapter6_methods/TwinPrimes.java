package chapter6_methods;

import chapter5_loops.DisplayPrimes;

/**
 * Displays all twin primes less than 1,000
 */
public class TwinPrimes
{
    public static void main(String[] args)
    {
        for (int i = 2; i < 1000; i++)
        {
            if (DisplayPrimes.isPrime(i) && DisplayPrimes.isPrime(i + 2))
            {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
