package chapter.eight.multidimensional.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Finds the largest sub-matrix of 1's in a square matrix of 1's and 0's.
 */
public class LargestBlock {
    public static void main(String[] args) {

//        Collect information from user
        var input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int numberOfRows = input.nextInt();

//        Create a matrix of the size indicated by input with randomly placed 1's and 0's.
        int[][] matrix = new int[numberOfRows][numberOfRows];
        var randomInt = new Random();
        for (var i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                matrix[i][j] = randomInt.nextInt(2);
            }
        }
        int[] answer = findLargestBlock(matrix);
        printMatrix(matrix);

//        Display results
        if (answer[0] == -1) {
            System.out.println("There are no blocks in this matrix.");
        } else
            System.out.println("The largest block is located at " + answer[0] + " " + answer[1] + " and the size is " + answer[2]);
    }

    /**
     * Prints a visual representation of the matrix in the console.
     *
     * @param matrix The matrix to be printed
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (var j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Finds the largest sub-matrix of 1's in a matrix of 1's and 0's
     *
     * @param matrix The matrix to check
     * @return Array with the following values [starting row of largest block, starting column of largest block, size of largest block]
     */
    public static int[] findLargestBlock(int[][] matrix) {

        // The answer format is [x, y, size]. x and y start at 0,0
        int[] answer = new int[3];

        // Initially, the largest size will be checked
        answer[2] = matrix.length;

        // The check matrix is a matrix equal to the size of the matrix used to determine which positions to check on each pass
        int[][] checkMatrix = new int[matrix.length][matrix.length];
        initializeCheckMatrix(checkMatrix);

        // Keep checking squares as long as the possible size is above 1
        while (answer[2] > 1) {
            for (int i = 0; i < checkMatrix.length; i++) {
                for (int j = 0; j < checkMatrix.length; j++) {

                    // If the space on the check matrix applies to this size of square, check it
                    if (checkMatrix[i][j] >= answer[2] && isASquare(i, j, answer[2], matrix)) {
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
            answer[2]--;
        }

//        If no squares are found, return this array as an error indicator.
        return new int[]{-1, -1, -1};
    }

    /**
     * Checks whether a certain portion of a matrix contains a sub-matrix of 1's.
     * @param x row to begin checking
     * @param y column to begin checking
     * @param size size of square to look for
     * @param matrix matrix to perform the check in
     * @return true if it's a square, false if not
     */
    public static boolean isASquare(int x, int y, int size, int[][] matrix) {
        for (int i = x; i < size + x; i++) {
            for (var j = y; j < size + y; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Creates a matrix to check values against when determining which subsections of a matrix to look for blocks in.
     * @param checkMatrix matrix to be initialized
     */
    public static void initializeCheckMatrix(int[][] checkMatrix) {
        int size = checkMatrix.length;
        for (var i = 0; i < size; i++) {
            var adjustment = i;
            var value = size;
            for (var j = 0; j < size; j++) {
                checkMatrix[i][j] = (value--) - adjustment;
                if (adjustment > 0) {
                    adjustment--;
                }
            }
        }
    }
}
