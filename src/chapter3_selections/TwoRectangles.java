package chapter3_selections;

import java.awt.geom.Point2D;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Enter the center, x, y, width and height of two rectangles and determine whether the
 * second rectangle is inside the first or overlaps with the first.
 */
public class TwoRectangles
{
    public static void main(String[] args)
    {
        // Get data from user
        Scanner input = new Scanner(in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        // Calculate center points of all sides of both rectangles
        Point2D.Double r1Center = new Point2D.Double(r1x, r1y);
        Point2D.Double r2Center = new Point2D.Double(r2x, r2y);
        Point2D.Double r1Left = new Point2D.Double(r1x - (r1width / 2), r1y);
        Point2D.Double r1Top = new Point2D.Double(r1x, r1y + (r1height / 2));
        Point2D.Double r1Right = new Point2D.Double(r1x + (r1width / 2), r1y);
        Point2D.Double r1Bottom = new Point2D.Double(r1x, r1y - (r1height / 2));
        Point2D.Double r2Left = new Point2D.Double(r2x - (r2width / 2), r2y);
        Point2D.Double r2Top = new Point2D.Double(r2x, r2y + (r2height / 2));
        Point2D.Double r2Right = new Point2D.Double(r2x + (r2width / 2), r2y);
        Point2D.Double r2Bottom = new Point2D.Double(r2x, r2y - (r2height / 2));

        // Find distances from center of r2 to sides of r1 and r2
        double centerToLeft_r2 = r2Center.distance(r2Left);
        double centerToLeft_r1 = r2Center.distance(r1Left);
        double centerToTop_r2 = r2Center.distance(r2Top);
        double centerToTop_r1 = r2Center.distance(r1Top);
        double centerToRight_r2 = r2Center.distance(r2Right);
        double centerToRight_r1 = r1Center.distance(r1Right);
        double centerToBottom_r2 = r2Center.distance(r2Bottom);
        double centerToBottom_r1 = r2Center.distance(r1Bottom);

        // Create some Booleans to make it legible!
        boolean allSidesIn = centerToLeft_r1 > centerToLeft_r2 && centerToTop_r1 > centerToTop_r2
                && centerToRight_r1 > centerToRight_r2 && centerToBottom_r1 > centerToBottom_r2;
        boolean someSidesIn = centerToLeft_r1 > centerToLeft_r2 || centerToTop_r1 > centerToTop_r2
                || centerToRight_r1 > centerToRight_r2 || centerToBottom_r1 > centerToBottom_r2;
        boolean someSidesNotIn = centerToLeft_r1 < centerToLeft_r2 || centerToTop_r1 < centerToTop_r2
                || centerToRight_r1 < centerToRight_r2 || centerToBottom_r1 < centerToBottom_r2;

        // Check if all four sides of r2 are inside of r1
        if (allSidesIn)
        {
            System.out.println("r2 is inside r1");

            // Check if r2 is partially overlapping r1
        } else if (someSidesIn && someSidesNotIn)
        {
            System.out.println("r2 overlaps r1");
        } else
        {
            System.out.println("r2 does not overlap r1");
        }
    }
}
