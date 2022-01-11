package chapter.eight.multidimensional.arrays;

import java.util.Random;

public class EvenNumberOfOnes {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        displayMatrix(matrix);
        if (checkMatrix(matrix)) {
            System.out.println("Has all even ones");
        } else {
            System.out.println("Does not have all even ones.");
        }
    }

    private static int[][] generateMatrix() {
        var generator = new Random();
        var matrix = new int[6][6];
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generator.nextInt(2);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkMatrix(int[][] matrix) {
        for (var i = 0; i < matrix.length; i++) {
            var numberOfOnes = 0;
            for (var j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numberOfOnes++;
                }
            }
            if (numberOfOnes == 0 || numberOfOnes % 2 != 0) {
                return false;
            }
        }
        for (var i = 0; i < matrix[0].length; i++) {
            var numberOfOnesVertical = 0;
            for (var j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    numberOfOnesVertical++;
                }
            }
            if (numberOfOnesVertical == 0 || numberOfOnesVertical % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
