package chapter6_methods;

import chapter5_loops.DisplayPrimes;

/**
 * Finds all Mersenne primes with p <= 31
 */
public class MersennePrime
{
    public static void main(String[] args)
    {
        System.out.println("p               2\u1D56-1");
        System.out.println("-------------------------");
        int mersenne;
        for (int p = 1; p <= 31; p++)
        {
            mersenne = getMersenne(p);
            if (DisplayPrimes.isPrime(mersenne))
            {
                System.out.printf("%-2d               %-6d\n", p, mersenne);
            }
        }
    }

    public static int getMersenne(int p)
    {
        return (int) Math.pow(2, p) - 1;
    }
}
