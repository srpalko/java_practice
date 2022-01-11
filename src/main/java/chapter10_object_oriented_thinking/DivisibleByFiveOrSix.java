package chapter10_object_oriented_thinking;

import java.math.BigInteger;

/**
 * Finds the first 10 numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 */
public class DivisibleByFiveOrSix
{
    public static void main(String[] args)
    {
        BigInteger bigNumber = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;
        while (count < 10)
        {
            bigNumber = bigNumber.add(BigInteger.ONE);
            if (bigNumber.remainder(BigInteger.valueOf(5L)).equals(BigInteger.ZERO)
                || bigNumber.remainder(BigInteger.valueOf(6L)).equals(BigInteger.ZERO))
            {
                System.out.println(bigNumber);
                count++;
            }
        }
    }
}
