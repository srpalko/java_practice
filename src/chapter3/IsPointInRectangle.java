package chapter3;

import java.util.Scanner;

public class IsPointInRectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double horizontalDistanceToCenter = Math.abs(x2);
        double verticalDistanceToCenter = Math.abs(y2);
        String isOrNot = horizontalDistanceToCenter <= 10.0 / 2 && verticalDistanceToCenter <= 5.0 / 2 ? "" : " not";
        System.out.printf("Point (%.1f, %.1f) is%s in the rectangle", x2, y2, isOrNot);
    }
}
