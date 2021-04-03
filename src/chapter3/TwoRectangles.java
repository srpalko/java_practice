package chapter3;

import java.awt.*;
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

        if (r2Left.distance(r1Left) > 0 && r2Top.distance(r1Top) > 0
            && r2Right.distance(r1Right) > 0 && r2Bottom.distance(r1Bottom) > 0)
        {
            System.out.println("r2 is inside r1");
        }
        else
        {
            // TODO: 4/2/2021
        }








    }
}
