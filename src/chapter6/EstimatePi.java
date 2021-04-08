package chapter6;

public class EstimatePi
{
    public static void main(String[] args)
    {
        // Test program
        System.out.println("i               m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= 901; i += 100)
        {
            double pi = estimatePi(i);
            System.out.printf("%-3d               %4.4f\n", i, pi);
        }
    }

    /**
     * Estimates pi to the accuracy of the number provided.
     * @param i number to determine the length of the series
     * @return an estimation of pi
     */
    public static double estimatePi(int i)
    {
        double sum = 0;
        for (int j = 1; j <= i; j++)
        {
            sum += Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return 4 * sum;
    }
}
