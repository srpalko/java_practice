package chapter3;

import java.util.Scanner;

public class PerimeterOfTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three edges of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && a + c > b && b + c > a)
        {
            System.out.println("The perimeter is " + (a + b + c));
        }
        else
        {
            System.out.println("That is not a valid triangle");
        }

    }
}
