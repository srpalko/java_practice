package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

public class StrictlyIdenticalArrays {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        var m1 = new int[3][3];
        getUserInput(m1, input);
        System.out.println();
        System.out.print("Enter list2: ");
        var m2 = new int[3][3];
        getUserInput(m2, input);
        var isEqual = equals(m1, m2);
        if (isEqual) {
            System.out.println("The two arrays are strictly identical.");
        } else {
            System.out.println("The two arrays are not strictly identical.");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (var row = 0; row < m1.length; row++) {
            if (m1[row].length != m2[row].length) {
                return false;
            }
            for (var column = 0; column < m1[row].length; column++) {
                if (m1[row][column] != m2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void getUserInput(int[][] matrix, Scanner input) {
        for (var row = 0; row < matrix.length; row++) {
            for (var column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }
}
