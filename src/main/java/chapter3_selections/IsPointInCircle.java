package chapter3_selections;

import java.util.Scanner;

public class IsPointInCircle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        final double X1 = 0;
        final double Y1 = 0;
        double distanceToCenter = Math.sqrt(Math.pow(x2 - X1, 2) + Math.pow(y2 - Y1, 2) );
        String isOrNot = distanceToCenter <= 10 ? "" : " not";
        System.out.printf("Point (%.1f, %.1f) is%s in the circle", x2, y2, isOrNot);
    }
}
