package chapter5_loops;

/**
 * Approximates e
 */
public class ComputeE
{
    public static void main(String[] args)
    {
        for (int i = 10000; i <= 100000; i += 10000)
        {
            double e = 1;
            double item = 1;
            for (int j = 2; j <= i; j++)
            {
                e += item;
                item = item / j;
            }
            System.out.println("With i = " + i + ", the approximation of e is " + e);
        }
        System.out.println("The value of e is " + Math.E);
    }
}
