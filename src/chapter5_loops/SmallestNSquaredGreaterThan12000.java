package chapter5_loops;

/**
 * Uses a while loop to find the smallest integer n such
 * that n squared is greater than 12,000.
 */
public class SmallestNSquaredGreaterThan12000
{
    public static void main(String[] args)
    {
        int n = 100;
        while (n * n <= 12000)
        {
            n++;
        }

        System.out.println("The smallest n\u00B2 > 12,000 is " + n + "\u00B2");
        System.out.println("n\u00B2 is " + (n * n));
    }
}
