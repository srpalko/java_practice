package chapter5_loops;

/**
 * Finds all perfect numbers less than 10,000.
 */
public class PerfectNumber
{
    public static void main(String[] args)
    {
        System.out.print("The four perfect numbers less than 10,000 are ");
        for (int i = 6; i < 10000; i++)
        {
            int divisor = i - 1;
            int sum = 0;
            while (divisor >= 1)
            {
                if (i % divisor == 0)
                {
                    sum += divisor;
                }
                divisor--;
            }
            if (i == sum)
            {
                System.out.print(i + " ");
            }
        }
    }
}
