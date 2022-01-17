package chapter.eight.multidimensional.arrays;

import java.util.Random;
import java.util.Scanner;

public class LargestBlock {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int numberOfRows = input.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfRows];
        var randomInt = new Random();
        for (var i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                matrix[i][j] = randomInt.nextInt(2);
            }
        }
        int[] answer = findLargestBlock(matrix);
        for (int[] ints : matrix) {
            for (var j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest block is located at " + answer[0] + " " + answer[1] + " and the size is " + answer[2]);
    }

    public static int[] findLargestBlock(int[][] matrix) {
        // The answer format is [x, y, size]. x and y start at 0,0
        int[] answer = new int[3];
        // Initially, the largest size will be checked
        answer[2] = matrix.length;
        // The check matrix is a matrix equal to the size of the matrix used to determine which positions to check on each pass
        int[][] checkMatrix = new int[matrix.length][matrix.length];
        // The top left space is set to a 1 to indicate. Ones indicate whether to check for a square at that index.
        checkMatrix[0][0] = 1;
        // Keep checking squares as long as the possible size is above 1
        while (answer[2] < 1) {
            // Iterate over the entire matrix
            for (int i = 0; i < checkMatrix.length; i++) {
                for (int j = 0; j < checkMatrix.length; j++) {
                    // If the space on the check matrix applies to this size of square, check it
                    if (checkMatrix[i][j] == 1) {
                        if (isASquare(i, j, answer[2], matrix)) {
                            return answer;
                        }
                    }
                }
            }
            updateCheckMatrix();
            answer[2]--;
        }
        int[] error = {-1, -1, -1};
        return error;
    }

    public static boolean isASquare(int x, int y, int size, int[][] matrix) {
        for (int i = x; i < size; i++) {
            for (var j = y; j < size; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
