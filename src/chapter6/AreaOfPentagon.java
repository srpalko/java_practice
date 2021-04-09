package chapter6;

import java.util.Scanner;

public class AreaOfPentagon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = area(side);
        System.out.println("The area of the pentagon is " + area);
    }

    public static double area(double side)
    {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
