package chapter5_loops;

/**
 * Approximates pi
 */
public class ComputePi
{
    public static void main(String[] args)
    {
        for (int j = 10000; j <= 100000 ; j+=10000)
        {
            double sum = 0;
            for (int i = 1, count = 1; i < (2 * j - 1); i += 2, count++)
            {
                if (count % 2 != 0)
                {
                    sum += 1.0 / i;
                } else
                {
                    sum -= 1.0 / i;
                }
            }
            double pi = 4 * sum;
            System.out.println("With i = " + j + ", the approximation of pi is " + pi);
        }
    }
}
