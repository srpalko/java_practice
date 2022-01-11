package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSorting {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        var matrix = new double[3][3];
        for (var row = 0; row < matrix.length; row++) {
            for (var column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        var sortedMatrix = sortColumns(matrix);
        System.out.println("\nThe column sorted array is ");
        for (var row : sortedMatrix) {
            for (var element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m) {
        var matrixCopy = Arrays.copyOf(m, m.length);
        for (var column = 0; column < matrixCopy.length; column++) {
            for (var elementIndex = matrixCopy.length - 1; elementIndex >= 0; elementIndex--) {
                var currentMax = matrixCopy[elementIndex][column];
                var currentMaxIndex = elementIndex;
                for (var pointer = elementIndex - 1; pointer >= 0; pointer--) {
                    if (currentMax < matrixCopy[pointer][column]) {
                        currentMax = matrixCopy[pointer][column];
                        currentMaxIndex = pointer;
                    }
                }
                if (currentMaxIndex != elementIndex) {
                    matrixCopy[currentMaxIndex][column] = matrixCopy[elementIndex][column];
                    matrixCopy[elementIndex][column] = currentMax;
                }
            }
        }
        return matrixCopy;
    }
}
