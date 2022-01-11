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

        return new int[3];
    }
}
