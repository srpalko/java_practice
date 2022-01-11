package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

/**
 * Returns the location of the largest element in a two dimensional array
 */
public class LocateLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        var rows = input.nextInt();
        var columns = input.nextInt();
        var array = new double[rows][columns];
        System.out.print("Enter the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
            input.nextLine();
        }
        var location = locateLargest(array);
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        var location = new int[2];
        var largestElement = a[0][0];
        for (var i = 0; i < a.length; i++) {
            for (var j = 0; j < a[i].length; j++) {
                if (a[i][j] > largestElement) {
                    largestElement = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
