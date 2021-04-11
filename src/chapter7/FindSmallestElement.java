package chapter7;

import java.util.Scanner;

public class FindSmallestElement
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        int length = array.length;
        for (int i = 0; i < length; i++)
        {
            array[i] = input.nextDouble();
        }

        double minimum = min(array);
        System.out.println("The minimum number is: " + minimum);
    }


    public static double min(double[] array)
    {
        double min = array[0];

        for (double num :
                array)
        {
            if (num < min)
            {
                min = num;
            }
        }
        return min;
    }

    public static int min(int[] array)
    {
        int min = array[0];

        for (int num :
                array)
        {
            if (num < min)
            {
                min = num;
            }
        }
        return min;
    }

}
