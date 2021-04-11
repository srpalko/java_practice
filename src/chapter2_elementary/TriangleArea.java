package chapter2_elementary;

import java.util.Scanner;

public class TriangleArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double side1 = sideCalc(x1, y1, x2, y2);
        double side2 = sideCalc(x2, y2, x3, y3);
        double side3 = sideCalc(x3, y3, x1, y1);
        double area = areaOfTriangle(side1, side2, side3);
        System.out.printf("The area of the triangle is %.1f", area);
    }

    public static double areaOfTriangle(double side1, double side2, double side3)
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double sideCalc(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }



}
