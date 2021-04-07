package chapter5;

/**
 * Compares the results of summation of the series 1 + 1/2 + 1/3 + ... + 1/n,
 * computing from left to right and from right to left with n = 50,000.
 */
public class CancellationErrors
{
    public static void main(String[] args)
    {
        // Compute result left to right
        double sum = 0;
        for (int divisor = 1; divisor <= 50000; divisor++)
        {
            sum += 1.0 / divisor;
        }
        System.out.println("When summed left to right, the total is " + sum);

        sum = 0;
        for (int divisor = 50000; divisor >= 1; divisor--)
        {
            sum += 1.0 / divisor;
        }
        System.out.println("When summed right to left, the total is " + sum);
    }
}
