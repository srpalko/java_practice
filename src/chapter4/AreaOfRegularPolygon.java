package chapter4;

import java.util.Scanner;

/**
 * Display the area of a regular polygon based on the number of sides and length of a side.
 */
public class AreaOfRegularPolygon
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate result
        double area = (numSides * side * side) / (4 * Math.tan(Math.PI / numSides));

        // Display
        System.out.println("The area of the polygon is " + area);
    }
}
