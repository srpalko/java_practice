package chapter7;

import java.util.Scanner;

public class IndexOfSmallestElement
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
        int mindex = indexOfSmallestElement(array);
        System.out.println("The index of the element with the smallest value is: " + mindex);
    }

    public static int indexOfSmallestElement(double[] array)
    {
        int mindex = 0;
        double min = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++)
        {
            if (array[i] < min)
            {
                mindex = i;
                min = array[i];
            }
        }
        return mindex;
    }
}
