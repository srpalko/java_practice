package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RowSorting {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        var matrix = new double[3][3];
        for (var row = 0; row < 3; row++) {
            for (var column = 0; column < 3; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        var sortedMatrix = sortRows(matrix);
        System.out.println("\nThe row-sorted array is");
        for (var row : sortedMatrix) {
            for (var element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /**
     * Sorts the rows in a two dimensional array.
     * @param m The matrix to sort
     * @return A new matrix with sorted rows
     */
    public static double[][] sortRows(double[][] m) {
        var sortedMatrix = Arrays.copyOf(m, m.length);
        for (var row : sortedMatrix) {
            Arrays.sort(row);
        }
        return sortedMatrix;
    }
}
