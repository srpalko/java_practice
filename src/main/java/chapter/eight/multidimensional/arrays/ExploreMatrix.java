package chapter.eight.multidimensional.arrays;

import java.util.Random;
import java.util.Scanner;

public class ExploreMatrix {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter the length of a square matrix: ");
        var length = input.nextInt();
        var matrix = new int[length][length];
        boolean isSameOnRow = false;
        boolean isSameOnColumn = false;
        boolean isSameOnDiagonal = false;
        boolean isSameOnSubDiagonal = false;
        var random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for (var i = 0; i < matrix.length; i++) {
            var same = true;
            for (var j = 0; j < matrix[0].length; j++) {
                if (matrix[i][0] != matrix[i][j]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("All " + matrix[i][0] + "'s on row " + (i + 1));
                isSameOnRow = true;
            }
        }
        for (var j = 0; j < matrix[0].length; j++) {
            var same = true;
            for (var i = 0; i < matrix.length; i++) {
                if (matrix[0][j] != matrix[i][j]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("All " + matrix[0][j] + "'s on column " + (j + 1));
                isSameOnColumn = true;
            }
        }
        var same = true;
        for (var i = 0; i < matrix.length; i++) {
            if (matrix[0][0] != matrix[i][i]) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("All " + matrix[0][0] + "'s on major diagonal");
            isSameOnDiagonal = true;
        }
        same = true;
        for (var i = 1; i < matrix.length; i++) {
            if (matrix[0][matrix.length - 1] != matrix[i][matrix.length - 1 - i]) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("All " + matrix[0][matrix.length - 1] + "'s on sub-diagonal");
            isSameOnSubDiagonal = true;
        }
        if (!isSameOnRow) {
            System.out.println("No same numbers on a row");
        }
        if (!isSameOnColumn) {
            System.out.println("No same numbers on a column");
        }
        if (!isSameOnDiagonal) {
            System.out.println("No same numbers on the major diagonal");
        }
        if (!isSameOnSubDiagonal) {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}
