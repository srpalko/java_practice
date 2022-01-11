package chapter3_selections;

import java.util.Scanner;

public class IntersectingPoint
{
    public static void main(String[] args)
    {
        // Get coordinates to test
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Solve for a, b, c, d, e, and f
        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        try
        {
            double[] intersection = Cramer(a, b, c, d, e, f);
            System.out.printf("The intersecting point is at (%.5f, %.5f)", intersection[0], intersection[1] );
        } catch (IllegalArgumentException exception)
        {
            System.out.println("The two lines are parallel.");
            System.exit(0);
        }
    }


    private static double[] Cramer(double a, double b, double c, double d, double e, double f)
            throws IllegalArgumentException
    {
        if (a * d - b * c == 0)
        {
            throw new IllegalArgumentException("No solution!");
        }
        else
        {
            double[] values = new double[2];
            values[0] = (e * d - b * f) / (a * d - b * c);
            values[1] = (a * f - e * c) / (a * d - b * c);
            return values;
        }
    }
}
