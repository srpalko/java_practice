package chapter6_methods;

public class SumSeries
{
    public static void main(String[] args)
    {
        // Test program
        System.out.println("i            m(i)");
        System.out.println("-----------------");
        for (int i = 1; i <= 20; i++)
        {
            double result = sumSeries(i);
            System.out.printf("%-1d            %4.4f\n", i, result);
        }
    }

    /**
     * Computes the series 1/2 + 2/3 + ... + i/i+1
     * @param i value for i/i+1 in computation
     * @return the sum of the series
     */
    public static double sumSeries(double i)
    {
        double sum = 0;

        for (int j = 1; j <= i; j++)
        {
            sum += (1.0 *j) / (j + 1);
        }
        return sum;
    }
}
