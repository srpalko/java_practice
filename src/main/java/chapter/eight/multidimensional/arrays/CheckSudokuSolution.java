package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

/**
 * Checks for a valid Sudoku solution by checking whether every row, every column, and every small box has the
 * numbers 1-9.
 */
public class CheckSudokuSolution {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    /**
     * Read a Sudoku solution from the console
     */
    public static int[][] readASolution() {
        // Create a scanner
        var input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        var grid = new int[9][9];
        for (var i = 0; i < 9; i++) {
            for (var j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }

    /**
     * Check whether a solution is valid
     */
    public static boolean isValid(int[][] grid) {
        if (checkRows(grid) && checkColumns(grid) && checkBoxes(grid)) {
            return true;
        }
        return false;
    }

    /**
     * Check whether all rows have all numbers 1-9
     */
    public static boolean checkRows(int[][] grid) {
        for (int[] row : grid) {
            var digitsPresent = new boolean[9];
            for (int digit : row) {
                var indexOfDigit = digit - 1;
                if (!digitsPresent[indexOfDigit]) {
                    digitsPresent[indexOfDigit] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Check whether all columns in a grid have all numbers 1-9
     */
    public static boolean checkColumns(int[][] grid) {
        for (var i = 0; i < 9; i++) {
            var digitsPresent = new boolean[9];
            for (var j = 0; j < 9; j++) {
                var indexOfDigit = grid[j][i] - 1;
                if (!digitsPresent[indexOfDigit]) {
                    digitsPresent[indexOfDigit] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Check whether all boxes in a grid have all numbers 1-9
     */
    public static boolean checkBoxes(int[][] grid) {
        for (var i = 0; i < 9; i += 3) {
            for (var j = 0; j < 9; j += 3) {
                var digitsPresent = new boolean[9];
                for (var k = (i / 3) * 3; k < (i / 3) * 3 + 3; k++) {
                    for (var l = (j / 3) * 3; l < (j / 3) * 3 + 3; l++) {
                        var indexOfDigit = grid[k][l] - 1;
                        if (!digitsPresent[indexOfDigit]) {
                            digitsPresent[indexOfDigit] = true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
