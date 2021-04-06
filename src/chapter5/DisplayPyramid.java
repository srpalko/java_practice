package chapter5;

import java.util.Scanner;

/**
 * Takes an integer from 1 - 15 and displays a pyramid.
 */
public class DisplayPyramid
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int height = input.nextInt();

        // Print the pyramid
        for (int row = 0; row < height; row++)
        {
            int num = row + 1;
            for (int col = height; col > 0; col--)
            {
                if (col == num)
                {
                    System.out.printf("%3d", num);
                    num--;
                } else
                {
                    System.out.print("   ");
                }
            }
            for (int col = 2; col <= height; col++)
            {
                if (col <= row + 1)
                {
                    System.out.printf("%3d", col);
                } else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
