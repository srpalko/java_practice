package chapter5_loops;

/**
 * Computes a summation that I don't know
 * how to represent in a comment.
 */
public class Summation
{
    public static void main(String[] args)
    {
        double sum = 0;

        for (int i = 625; i >= 2; i--)
        {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i - 1));
        }

        System.out.println("The summation is " + sum);
    }
}
