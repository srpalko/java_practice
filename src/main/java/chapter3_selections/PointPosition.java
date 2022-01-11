package chapter3_selections;

import java.util.Scanner;

/**
 * Program that takes two points representing a directed line (p0 to p1), and
 * a third point, p2. The program will then display whether p2 is on the left or right
 * of the line, or is on the line.
 */
public class PointPosition
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

        // Display result
        if (placement > 0)
        {
            System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                                x2, y2, x0, y0, x1, y1);
        } else if (placement == 0)
        {
            System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        } else if (placement < 0)
        {
            System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
