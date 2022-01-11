package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {
    private static char[][] boardMatrix = new char[6][7];

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var currentPlayer = 'Y';
        int[] currentIndexesOfColumns = {5, 5, 5, 5, 5, 5, 5};
        intitializeBoard();
        do {
            currentPlayer = currentPlayer == 'R' ? 'Y' : 'R';
            drawBoard();
            System.out.print("Drop a red disk at column (0-6): ");
            int column = input.nextInt();
            if (currentIndexesOfColumns[column] < 0) {
                System.out.println("That column is full.");
                continue;
            }
            boardMatrix[currentIndexesOfColumns[column]--][column] = currentPlayer;

        } while (!isConsecutiveFour(boardMatrix));
        drawBoard();
        System.out.println(currentPlayer + " is the WINNER!");
    }

    private static void intitializeBoard() {
        for (char[] row : boardMatrix) {
            Arrays.fill(row, ' ');
        }
    }

    private static void drawBoard() {
        for (char[] row : boardMatrix) {
            for (char spot : row) {
                System.out.print("| " + spot + " ");
            }
            System.out.println("|");
        }
        System.out.println("----------------------");
    }

    public static boolean isConsecutiveFour(char[][] values) {
        if (horizontalMatch(values)) return true;
        if (verticalMatch(values)) return true;
        if (leftDiagonalMatch(values)) { return true; }
        return rightDiagonalMatch(values);
    }

    private static boolean leftDiagonalMatch(char[][] values) {
        for (var i = 0; i < values.length; i++) {
            for (var j = 0; j < values[i].length; j++) {
                var current = values[i][j];
                var matches = 1;
                int testRow = 1;
                int testColumn = -1;
                while ((i + testRow < values.length) && (j + testColumn >= 0)) {
                    if (current == values[i + testRow][j + testColumn] && current != ' ') {
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

    private static boolean rightDiagonalMatch(char[][] values) {
        for (var i = 0; i < values.length; i++) {
            for (var j = 0; j < values[i].length; j++) {
                var current = values[i][j];
                var matches = 1;
                int testRow = 1;
                int testColumn = 1;
                while ((i + testRow < values.length) && (j + testColumn < values[i].length)) {
                    if (current == values[i + testRow][j + testColumn] && current != ' ') {
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

    private static boolean verticalMatch(char[][] values) {
        for (var i = 0; i < values[0].length; i++) {
            var consecutiveVerticalMatches = 1;
            var current = values[0][i];
            for (char[] value : values) {
                if (value[i] == current && current != ' ') {
                    consecutiveVerticalMatches++;
                } else {
                    current = value[i];
                    consecutiveVerticalMatches = 1;
                }
                if (consecutiveVerticalMatches == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean horizontalMatch(char[][] values) {
        for (char[] value : values) {
            var consecutiveHorizontalMatches = 1;
            var current = value[0];
            for (char i : value) {
                if (i == current && current != ' ') {
                    consecutiveHorizontalMatches++;
                } else {
                    current = i;
                    consecutiveHorizontalMatches = 1;
                }
                if (consecutiveHorizontalMatches == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
