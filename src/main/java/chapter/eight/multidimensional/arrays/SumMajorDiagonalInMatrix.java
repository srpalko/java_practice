package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class SumMajorDiagonalInMatrix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] matrix = new double[4][4];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
            input.nextLine();
        }
        System.out.println("The sum of elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }


    /**
     * Sums all the numbers in the major diagonal in an n X n matrix of double values.
     * @param m matrix to check
     * @return sum of numbers
     */
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum = 0;

        for (int i = 0; i < m.length; i++)
        {
            sum += m[i][i];
        }
        return sum;
    }
}
