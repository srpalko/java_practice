package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

/**
 * An n X n matrix is called a positive Markov matrix if each element is positive and the sum of the elements in each
 * column is 1.
 */
public class MarkovMatrix {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        var matrix = new double[3][3];
        for (var row = 0; row < matrix.length; row++) {
            for (var column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
            input.nextLine();
        }
        var output = isMarkovMatrix(matrix) ? "It is a Markov matrix." : "It is not a Markov matrix.";
        System.out.println(output);
    }

    /**
     * Checks whether a matrix is a Markov matrix.
     * @param m A matrix to check.
     * @return True if the matrix is a Markov matrix, false otherwise.
     */
    public static boolean isMarkovMatrix(double[][] m) {
        for (var column = 0; column < m[0].length; column++) {
            var columnTotal = 0.0;
            for (var row = 0; row < m.length; row++) {
                if (m[row][column] < 0) {
                    return false;
                }
                columnTotal += m[row][column];
            }
            if (columnTotal != 1.0) {
                return false;
            }
        }
        return true;
    }
}
