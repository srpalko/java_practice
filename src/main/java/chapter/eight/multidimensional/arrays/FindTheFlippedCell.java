package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class FindTheFlippedCell {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        var matrix = new int[6][6];
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        var flippedLocation = findFlip(matrix);
        System.out.println("The flipped cell is at (" + flippedLocation[0] + ", " + flippedLocation[1] + ")");
    }

    private static int[] findFlip(int[][] matrix) {
        var numberOfOnes = 0;
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numberOfOnes++;
                }
            }
            if (numberOfOnes > 0 && numberOfOnes % 2 != 0) {
                var column = checkColumns(matrix);
                int[] flippedLocation = {i, column};
                return flippedLocation;
            }
        }
        return null;
    }

    private static int checkColumns(int[][] matrix) {
        var numberOfVerticalOnes = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    numberOfVerticalOnes++;
                }
            }
            if (numberOfVerticalOnes > 0 && numberOfVerticalOnes % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
