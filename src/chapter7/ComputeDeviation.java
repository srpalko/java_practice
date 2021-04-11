package chapter7;

import java.util.Scanner;

public class ComputeDeviation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f\n", mean(array));
        System.out.printf("The standard deviation is %.5f", deviation(array));
    }

    public static double deviation(double[] x)
    {
        double sum = 0;
        double mean = mean(x);
        for (double num :
                x)
        {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x)
    {
        double sum = 0;
        for (double num :
                x)
        {
            sum += num;
        }
        return sum / x.length;
    }
}
