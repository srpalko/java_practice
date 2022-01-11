package chapter3_selections;

import java.awt.geom.Point2D;
import java.util.Scanner;

/**
 * Prompt user for coordinates and radii of two circles and determine whether the second
 * circle is inside the first or overlaps with the first.
 */
public class TwoCircles
{
    public static void main(String[] args)
    {
        // Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        // Make center coordinates into point objects
        Point2D.Double center1 = new Point2D.Double(x1, y1);
        Point2D.Double center2 = new Point2D.Double(x2, y2);

        boolean isInside = center1.distance(center2) <= Math.abs(r1 - r2);
        boolean overlaps = center1.distance(center2) <= Math.abs(r1 + r2);

        if (isInside)
        {
            System.out.println("circle2 is inside circle1");
        } else if (overlaps)
        {
            System.out.println("circle2 overlaps circle1");
        } else
        {
            System.out.println("circle2 does not overlap circle1");
        }




    }
}
