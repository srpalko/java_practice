package chapter8_multidimensional_arrays;

import java.util.Scanner;

/**
 * Reads a 3-by-4 matrix and displays the sum of each column
 */
public class SumElementsColByCol
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
            input.nextLine();
        }
        for (int i = 0; i < 4; i++)
        {
            System.out.println("The sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }

    }
    
    
    /**
     * Returns the sum of all the elements in a specified column in a matrix.
     * @param m the matrix to calculate
     * @param columnIndex the index of the column to sum
     * @return the sum of the elements in the column
     */
    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum = 0;
        for (double[] doubles : m)
        {
            sum += doubles[columnIndex];
        }
        return sum;
    }
}
