package chapter6_methods;

/**
 * A program that displays the first 100
 * pentagonal numbers.
 */
public class PentagonalNumbers
{
    public static void main(String[] args)
    {
        final int NUMBERS_PER_LINE = 10;

        for (int i = 1; i <= 100; i++)
        {
            if (i % NUMBERS_PER_LINE == 0)
            {
                System.out.printf("%5d  \n", getPentagonalNumber(i));
            } else
            {
                System.out.printf("%5d  ", getPentagonalNumber(i));
            }
        }
    }

    public static int getPentagonalNumber(int n)
    {
        return n * (3 * n - 1) / 2;
    }
}
