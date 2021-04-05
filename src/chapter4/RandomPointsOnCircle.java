package chapter4;

import static chapter2.TriangleArea.sideCalc;

/**
 * Generates three random points on a circle centered at (0, 0) with radius 40.
 * Displays three angles in a triangle formed by these three points.
 */
public class RandomPointsOnCircle
{
    public static void main(String[] args)
    {
        final double RADIUS = 40;
        // Generate the points
        // Generate three random angles between 0 and 2 * PI
        double randAngle1 = Math.random() * (2 * Math.PI);
        double randAngle2 = Math.random() * (2 * Math.PI);
        double randAngle3 = Math.random() * (2 * Math.PI);

        // Determine a point on the circle based on the three angles
        double point1x = RADIUS * Math.cos(randAngle1);
        double point1y = RADIUS * Math.sin(randAngle1);
        double point2x = RADIUS * Math.cos(randAngle2);
        double point2y = RADIUS * Math.sin(randAngle2);
        double point3x = RADIUS * Math.cos(randAngle3);
        double point3y = RADIUS * Math.sin(randAngle3);

        // Determine sides
        double side1 = sideCalc(point1x, point1y, point2x, point2y);
        double side2 = sideCalc(point2x, point2y, point3x, point3y);
        double side3 = sideCalc(point3x, point3y, point1x, point1y);

        // Determine angles
        double A = Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3));
        double B = Math.acos((Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2)) / (2 * side1 * side3));
        double C = Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2));

        // Convert to degrees
        A = Math.toDegrees(A);
        B = Math.toDegrees(B);
        C = Math.toDegrees(C);

        // Display angles
        System.out.printf("The three angles formed are %.2f, %.2f, and %.2f", A, B, C);

    }
}
