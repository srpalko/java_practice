package chapter.eight.multidimensional.arrays;

import java.util.Arrays;
import java.util.Random;

public class ShuffleRows {
    private static final Random randomInt = new Random();

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void shuffle(int[][] m) {
        for (var i = 0; i < m.length; i++) {
            var swapIndex = randomInt.nextInt(m.length - 1);
            var temp = m[swapIndex];
            m[swapIndex] = m[i];
            m[i] = temp;
        }
    }
}
