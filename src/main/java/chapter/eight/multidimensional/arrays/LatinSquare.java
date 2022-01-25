package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly
 * once in each row and once in each column. This program prompts the user to enter the number n and
 * the array of characters, and checks if the input array is a Latin square. The characters are the
 * first n characters starting from A.
 */
public class LatinSquare {
  public static void main(String[] args) {

    //    Get input from user
    var input = new Scanner(System.in);
    System.out.print("Enter number n: ");
    int n = input.nextInt();
    char[] legalCharacters = new char[n];
    int startingChar = 65;
    for (int i = 0; i < n; i++) {
      legalCharacters[i] = (char) (startingChar + i);
      System.out.println(legalCharacters[i]);
    }

    char[][] square = new char[n][n];
    System.out.println("Enter 3 rows of letters separated by spaces: ");
    for (int i = 0; i < n; i++) {
      String[] letters = new String[n];
      for (var j = 0; j < n; j++) {
        letters[j] = input.next();
        if (Arrays.binarySearch(legalCharacters, letters[j].charAt(0)) >= 0) {
          square[i][j] = letters[j].charAt(0);
        } else {
          System.out.println(
              "Wrong input: the letters must be from "
                  + legalCharacters[0]
                  + " to "
                  + legalCharacters[n - 1]);
          System.exit(666);
        }
      }
      input.nextLine();
    }

    //    Check if the input is a Latin square and output result.
    if (isLatinSquare(square, legalCharacters)) {
      System.out.println("The input array is a Latin square.");
    } else {
      System.out.println("The input array is not a Latin square.");
    }
  }

  private static boolean isLatinSquare(char[][] square, char[] legalChars) {
    for (int i = 0; i < square.length; i++) {
      int[] checkArray = new int[square.length];
      for (int j = 0; j < square.length; j++) {
        int index = Arrays.binarySearch(legalChars, square[i][j]);
        if (index >= 0) {
          checkArray[index] = 1;
        }
      }
      if (Arrays.binarySearch(checkArray, 0) >= 0) {
        return false;
      }
    }
    for (int k = 0; k < square.length; k++) {
      int[] checkArray = new int[square.length];
      for (int l = 0; l < square.length; l++) {
        int index = Arrays.binarySearch(legalChars, square[l][k]);
        if (index >= 0) {
          checkArray[index] = 1;
        }
      }
      if (Arrays.binarySearch(checkArray, 0) >= 0) {
        return false;
      }
    }
    return true;
  }
}
