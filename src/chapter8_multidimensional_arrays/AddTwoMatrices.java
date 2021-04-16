package chapter8_multidimensional_arrays;

import java.util.Scanner;

/**
 * Prompts the user to enter two 3x3 matrices and displays their sum.
 */
public class AddTwoMatrices
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                matrix1[i][j] = input.nextDouble();
            }
        }
        input.nextLine();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < matrix2.length; i++)
        {
            for (int j = 0; j < matrix2[i].length; j++)
            {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] sumMatrix = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are added as follows");

        // For every row
        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print((i == 1 ? "  +  " : "     "));
            for (int j = 0; j < matrix2.length; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print((i == 1 ? "  =  " : "     "));
            for (int j = 0; j < sumMatrix.length; j++)
            {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b)
    {
        double[][] sumMatrix = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                sumMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return sumMatrix;
    }
}
