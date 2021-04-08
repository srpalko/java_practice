package chapter5;

/**
 * Displays all prime numbers between 2 and 1,000, inclusive.
 * Displays 8 numbers per line separated by one space.
 */
public class DisplayPrimes
{
    public static void main(String[] args)
    {
        System.out.println("The prime numbers between 2 and 1,000 are: ");

        int count = 0;
        final int NUMBER_OF_COLUMNS = 8;
        for (int i = 2; i <= 1000; i++)
        {
            if (isPrime(i))
            {
                count++;
                if (count % NUMBER_OF_COLUMNS == 0)
                {
                    System.out.println(i);
                } else
                {
                    System.out.printf("%-3d ", i);
                }
            }
        }
    }

    /**
     * Determines whether a number is a prime number.
     * @param number an integer
     * @return true if number is prime, false if it is not
     */
    public static boolean isPrime(int number)
    {
        if (number == 1)
        {
            return false;
        }
        for (int divisor = 2; divisor <= number / 2; divisor++)
        {
            if (number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }
}
