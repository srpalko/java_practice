package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Converts a decimal number to its
 * corresponding hex value between 0 and 15.
 */
public class DecimalToHex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();

        if (number > 15 || number < 0)
        {
            System.out.println(number + " is an invalid input");
        } else if (number > 9)
        {
            int hex = number + 55;
            System.out.println("The hex value is " + (char) hex);
        } else
        {
            System.out.println("The hex value is " + number);
        }
    }
}
