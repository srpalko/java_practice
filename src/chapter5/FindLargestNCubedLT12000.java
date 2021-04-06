package chapter5;

/**
 * Uses a while loop to find the largest integer n
 * such that n cubed is less than 12,000.
 */
public class FindLargestNCubedLT12000
{
    public static void main(String[] args)
    {
        int n = 2;

        do
        {
            n++;
        } while ((n + 1) * (n + 1) * (n + 1) < 12000);

        System.out.println("The largest n such that n\u00B3 is < 12,000 is " + n);
        System.out.println("n\u00B3 is " + (n * n * n));
    }
}
