package chapter5;

import java.util.Scanner;

/**
 * Takes ten numbers and displays the mean and standard deviation
 * of those numbers.
 */
public class ComputeMeanAndStdDeviation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int count = 0;
        double sum = 0;
        double sumSquare = 0;
        while (count < 10)
        {
            double number = input.nextDouble();
            count++;
            sum += number;
            sumSquare += number * number;
        }
        double mean = sum / count;
        double deviation = Math.sqrt((sumSquare - (Math.pow(sum, 2) / count)) / (count - 1));

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f", deviation);
    }
}
