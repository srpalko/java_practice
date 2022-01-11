package chapter.eight.multidimensional.arrays;

import java.util.Arrays;

public class SortTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] test = {
                {4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}
        };
        sort(test);
        for (int[] row : test
        ) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sort(int[][] matrix) {

        // start at the last row
        for (int i = matrix.length - 1; i >= 0; i--) {

            // Take the last row as the current highest valued row
            int[] currentMax = matrix[i];

            // The index of the row with the highest value
            int currentMaxIndex = i;

            // Iterate through the rows in reverse, starting with the row above the current max.
            for (int j = i - 1; j >= 0; j--) {

                // If the first column of the current high row is equal to the first column of the row above...
                if (currentMax[0] == matrix[j][0]) {

                    // Check if this column is less than the corresponding column in the next row.
                    // If so, the next column becomes the max.
                    if (currentMax[1] < matrix[j][1]) {
                        currentMax = matrix[j];
                        currentMaxIndex = j;
                    }

                    // If they aren't equal, check if the next row is greater, and set as the max if it is.
                } else if (currentMax[0] < matrix[j][0]) {
                    currentMax = matrix[j];
                    currentMaxIndex = j;
                }
            }

            // If the original index did not remain constant,
            if (currentMaxIndex != i) {
                matrix[currentMaxIndex] = matrix[i];
                matrix[i] = currentMax;
            }
        }
    }
}
