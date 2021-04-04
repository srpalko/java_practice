package chapter3;

import java.util.Scanner;

/**
 * Similar to PointPosition but determines if a point is on a line segment
 * as opposed to an unbounded line. Enter two points for the line and a
 * third point to be checked.
 */
public class PointOnLineSegment
{
    public static void main(String[] args)
    {
        // Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // calculate result
        double placement = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        boolean onLine = x2 > x0 && x2 < x1 && y2 > y0 && y2 < y1;
        if (placement == 0 && onLine)
        {
            System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        } else
        {
            System.out.printf("(%.1f, %.1f) is not on the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
