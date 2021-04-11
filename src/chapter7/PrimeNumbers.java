package chapter7;

import java.util.Arrays;

/**
 * Displays the first 50 prime numbers using a
 * more efficient approach.
 */
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int[] primes = new int[50];
        Arrays.fill(primes, 2);
        int index= 0;
        int i = 2;

        do
        {
            if (isPrime(i, primes))
            {
                primes[index] = i;
                index++;
            }
            i++;
        } while (index < 50);

        displayPrimes(primes);
    }

    public static boolean isPrime(int num, int[] primeArray)
    {
        for (int i = 0; primeArray[i] <= Math.sqrt(num); i++)
        {
            if (num % primeArray[i] == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void displayPrimes(int[] primes)
    {
        for (int prime : primes)
        {
            System.out.print(prime + " ");
        }
    }

}


