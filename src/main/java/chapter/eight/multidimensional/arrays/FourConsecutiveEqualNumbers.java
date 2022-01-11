package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class FourConsecutiveEqualNumbers {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        var rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        var columns = input.nextInt();
        var matrix = new int[rows][columns];
        for (var i = 0; i < rows; i++) {
            System.out.print("Enter the values for row " + (i + 1) + ": ");
            for (var j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println(isConsecutiveFour(matrix));
    }

    public static boolean isConsecutiveFour(int[][] values) {

        /* Check horizontal */
        if (horizontalMatch(values)) return true;

        /* Check vertical */
        if (verticalMatch(values)) return true;

        /* Check left diagonal */
        if (leftDiagonalMatch(values)) {
            return true;
        }

        /* Check right diagonal */
        return rightDiagonalMatch(values);
    }

    private static boolean leftDiagonalMatch(int[][] values) {
        for (var i = 0; i < values.length; i++) {
            for (var j = 0; j < values[i].length; j++) {
                var current = values[i][j];
                var matches = 1;
                int testRow = 1;
                int testColumn = -1;
                while ((i + testRow < values.length) && (j + testColumn >= 0)) {
                    if (current == values[i + testRow][j + testColumn]) {
                        matches++;
                        testRow++;
                        testColumn--;
                    } else {
                        break;
                    }
                    if (matches == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean rightDiagonalMatch(int[][] values) {
        for (var i = 0; i < values.length; i++) {
            for (var j = 0; j < values[i].length; j++) {
                var current = values[i][j];
                var matches = 1;
                int testRow = 1;
                int testColumn = 1;
                while ((i + testRow < values.length) && (j + testColumn < values[i].length)) {
                    if (current == values[i + testRow][j + testColumn]) {
                        matches++;
                        testRow++;
                        testColumn++;
                    } else {
                        break;
                    }
                    if (matches == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean verticalMatch(int[][] values) {
        for (var i = 0; i < values[0].length; i++) {
            var consecutiveVerticalMatches = 0;
            var current = values[0][i];
            for (int[] value : values) {
                if (value[i] == current) {
                    consecutiveVerticalMatches++;
                } else {
                    current = value[i];
                }
                if (consecutiveVerticalMatches == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean horizontalMatch(int[][] values) {
        for (int[] value : values) {
            var consecutiveHorizontalMatches = 0;
            var current = value[0];
            for (int i : value) {
                if (i == current) {
                    consecutiveHorizontalMatches++;
                } else {
                    current = i;
                }
                if (consecutiveHorizontalMatches == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
