package chapter8_multidimensional_arrays;


import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class NineHeadsAndTails
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        // Make an array to hold the values
        int[] binaryArray = new int[9];
        // fill with 'H' to start
        Arrays.fill(binaryArray, 0);
        // create a binary string of the number
        String binaryString = Integer.toBinaryString(number);
        for (int i = 9 - binaryString.length(), stringIndex = 0; i < binaryArray.length; i++, stringIndex++)
        {
            binaryArray[i] = Integer.parseInt(String.valueOf(binaryString.charAt(stringIndex)));
        }
        System.out.println(binaryString);
        System.out.println(Arrays.toString(binaryArray));
        char[][] matrix = new char[3][3];
        int next = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = binaryArray[next] == 1 ? 'T' : 'H';
                next++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
