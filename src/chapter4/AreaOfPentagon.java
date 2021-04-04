package chapter4;

import java.util.Scanner;

/**
 * Computes the area of a pentagon based on the length from the center
 * to a vertex.
 */
public class AreaOfPentagon
{
    public static void main(String[] args)
    {
        // Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        // Compute the length of a side
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Compute the area
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        // Display the results
        System.out.printf("The area of the pentagon is %.2f", area);
    } // end main
} // end class
