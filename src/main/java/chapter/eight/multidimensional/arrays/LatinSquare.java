package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

/**
 * A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly once in each row and once in each column.
 * This program prompts the user to enter the number n and the array of characters, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 */
public class LatinSquare {
    public static void main(String[] args) {

        //    Get input from user
        var input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        char[] letters = new char[n];
        for (int i = 0; i < n; i++) {
            letters[i] = (char)(i + 65);
            System.out.println(letters[i]);
        };
        System.out.print("Enter 4 rows of letters separated by spaces: ");
        var square = new char[4][4];
        for (int i = 0; i < square.length; i++) {
            String row = input.nextLine();
            square[i] = row.toCharArray();
        }

//    Check if the input is a Latin square and output result.
        if (isLatinSquare(square)) {
            System.out.println("The input array is a Latin square.");
        } else {
            System.out.println("The input array is not a Latin square.");
        }
    }

    private static boolean isLatinSquare(char[][] square) {
        return false;
    }
}
