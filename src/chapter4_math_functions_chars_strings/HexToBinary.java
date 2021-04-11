package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Converts a hex digit to its corresponding binary value.
 */
public class HexToBinary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit (Only the first character of an entry will be converted): ");
        String hex = input.nextLine();
        try
        {
            int digit = Integer.parseInt(String.valueOf(hex.charAt(0)), 16);
            System.out.println("The binary value is " + Integer.toBinaryString(digit));
        } catch (NumberFormatException e)
        {
            System.out.println(hex + " is an invalid input");
            System.exit(1);
        }
    }
}
