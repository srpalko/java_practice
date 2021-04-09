package chapter6;

import java.util.Scanner;

public class PointPosition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        String whereItIs;

        if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
        {
            whereItIs = "line segment";
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
        {
            whereItIs = "same line";
        } else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
        {
            whereItIs = "left side of the line";
        } else
        {
            whereItIs = "right side of the line";
        }

        System.out.printf("(%.1f, %.1f) is on the %s from (%.1f, %.1f) to (%.1f, %.1f)",
                            x2, y2, whereItIs, x0, y0, x1, x1);
    }


    /**
     * Returns true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1)
     * @param x0 x of point 0 on directed line
     * @param y0 y of point 0 on directed line
     * @param x1 x of point 1 on directed line
     * @param y1 y of point 1 on directed line
     * @param x2 x of point to check
     * @param y2 y of point to check
     * @return true if point is left of the line
     */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }

    /**
     * Returns true if point (x2, y2) is on the
     * directed line from (x0, y0) to (x1, y1)
     * @param x0 x of point 0 on directed line
     * @param y0 y of point 0 on directed line
     * @param x1 x of point 1 on directed line
     * @param y1 y of point 1 on directed line
     * @param x2 x of point to check
     * @param y2 y of point to check
     * @return true if point is on the line
     */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }

    /**
     * Returns true if point (x2, y2) is on the
     * line segment from (x0, y0) to (x1, y1)
     * @param x0 x of point 0 on directed line
     * @param y0 y of point 0 on directed line
     * @param x1 x of point 1 on directed line
     * @param y1 y of point 1 on directed line
     * @param x2 x of point to check
     * @param y2 y of point to check
     * @return true if point is on the line
     */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        // calculate result
        boolean onLine = x2 > x0 && x2 < x1 && y2 > y0 && y2 < y1;
        return (onTheSameLine(x0, y0, x1, y1, x2, y2) && onLine);
    }
}
