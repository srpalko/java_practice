package chapter3;

import java.util.Scanner;

public class IsPointInTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("A right triangle is placed in a plane with the right angle point at (0,0).");
        System.out.println("The other two points are placed at (200,0) and (0, 100).");
        System.out.print("Enter a point x y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x >= 0 && x <= 200 && y >= 0 && y <= ((200 - x) / 200) * 100)
        {
            System.out.println("The point is in the triangle");
        }
        else
        {
            System.out.println("The point is not in the triangle");
        }

    }
}
