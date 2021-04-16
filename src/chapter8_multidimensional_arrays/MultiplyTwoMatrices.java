package chapter8_multidimensional_arrays;


import java.util.Arrays;
import java.util.Scanner;

public class MultiplyTwoMatrices
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
        System.out.println("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < matrix2.length; i++)
        {
            for (int j = 0; j < matrix2[i].length; j++)
            {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] product = multiplyMatrix(matrix1, matrix2);
        System.out.println("The multiplication of the matrices is ");
        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[i].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print((i == 1 ? "  x  " : "     "));
            for (int j = 0; j < matrix1[i].length; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print((i == 1 ? "  =  " : "     "));
            for (int j = 0; j < matrix1[i].length; j++)
            {
                System.out.printf("%.1f ", product[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b)
    {
        double[][] productMatrix = new double[a.length][a[0].length];


        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                double product = 0;
                for (int k = 0; k < 3; k++)
                {
                    product += a[i][k] * b[k][j];
                }
                productMatrix[i][j] = product;
            }
        }
        return productMatrix;
    }
}
