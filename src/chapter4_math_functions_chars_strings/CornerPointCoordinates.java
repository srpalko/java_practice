package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Takes a radius of the bounding circle of a pentagon centered at (0, 0) with one
 * point at the 0 o'clock position, and displays the coordinates
 * of the five corner points on the pentagon.
 */
public class CornerPointCoordinates
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // Calculate (wish me luck!)
        double theta = (2 * Math.PI) / 5;
        double p1x = radius * Math.sin(theta);
        double p1y = radius * Math.cos(theta);
        double p2x = radius * Math.sin(theta * 2);
        double p2y = radius * Math.cos(theta * 2);
        double p3x = radius * Math.sin(theta * 3);
        double p3y = radius * Math.cos(theta * 3);
        double p4x = radius * Math.sin(theta * 4);
        double p4y = radius * Math.cos(theta * 4);
        double p5x = radius * Math.sin(theta * 5);
        double p5y = radius * Math.cos(theta * 5);

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%f, %f)\n", p1x, p1y);
        System.out.printf("(%f, %f)\n", p2x, p2y);
        System.out.printf("(%f, %f)\n", p3x, p3y);
        System.out.printf("(%f, %f)\n", p4x, p4y);
        System.out.printf("(%f, %f)\n", p5x, p5y);
    }
}
