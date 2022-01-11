package chapter6_methods;

import java.util.Scanner;

public class MyTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3))
        {
            double area = area(side1, side2, side3);
            System.out.println("The area of the triangle is : " + area);
        } else
        {
            System.out.println("That is not a valid triangle");
        }
    }
    /**
     * Returns true if the sum of any two sides is
     * greater than the third side.
     * @param side1 1st side of a triangle
     * @param side2 2nd side of a triangle
     * @param side3 3rd side of a triangle
     * @return true if triangle is valid
     */
    public static boolean isValid(double side1, double side2, double side3)
    {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    /**
     * Return the area of a triangle based on the three sides
     * @param side1 1st side of the triangle
     * @param side2 2nd side of the triangle
     * @param side3 3rd side of the triangle
     * @return the area of the triangle
     */
    public static double area(double side1, double side2, double side3)
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
