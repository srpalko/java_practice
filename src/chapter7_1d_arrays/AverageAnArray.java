package chapter7_1d_arrays;

import java.util.Scanner;

/**
 * Methods that return the average of an array.
 */
public class AverageAnArray
{
    /**
     * Test program that prompts the user to enter ten
     * double values, invokes the method and displays
     * the average value.
     * @param args args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        int length = numbers.length;
        for (int i = 0; i < length; i++)
        {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The average is: " + average(numbers));
    }

    /**
     * Returns the average of the elements in an
     * integer array.
     * @param array an array to calculate the average value for
     * @return the average value of the elements in the array
     */
    public static int average(int[] array)
    {
        int sum = 0;
        for (int number :
                array)
        {
            sum += number;
        }
        return sum / array.length;
    }

    /**
     * Returns the average of the elements in a
     * double array.
     * @param array an array to calculate the average value for
     * @return the average value of the elements in the array
     */
    public static double average(double[] array)
    {
        double sum = 0;
        for (double number :
                array)
        {
            sum += number;
        }
        return sum / array.length;
    }
}
