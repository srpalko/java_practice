package chapter6_methods;

import static chapter5_loops.DisplayPrimes.isPrime;

public class UseIsPrime
{
    public static void main(String[] args)
    {
        int number = 2;
        int count = 0;

        do
        {
            if (isPrime(number))
            {
                count++;
            }
            number++;
        } while (number < 10000);

        System.out.println("There are " + count + " prime numbers less than 10,000.");
    }

}
