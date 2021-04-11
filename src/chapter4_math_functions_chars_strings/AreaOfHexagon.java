package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Displays the area of a hexagon based on the length of a side.
 */
public class AreaOfHexagon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
