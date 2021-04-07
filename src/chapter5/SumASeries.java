package chapter5;

/**
 * Sums the series 1/3 + 3/5 + 5/7 + 9/11 + 11/13 + ... + 95/97 + 97/99
 */
public class SumASeries
{
    public static void main(String[] args)
    {
        double sum = 0;
        for (int i = 1, j = 3; i <= 97; i += 2, j += 2)
        {
            sum += 1.0 * i / j;
        }
        System.out.println("The sum is " + sum);
    }
}
