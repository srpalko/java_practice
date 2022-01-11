package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Checks for a valid Social Security number entered as
 * DDD-DD-DDDD, where D is a digit.
 */
public class CheckSSN
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        // Check formatting and length
        if (ssn.length() != 11 || ssn.charAt(3) != '-' || ssn.charAt(6) != '-')
        {
            System.out.println(ssn + " is an invalid social security number");
            System.exit(0);
        }

        // Check for numbers
        try
        {
            Integer.parseInt(ssn.substring(0, 3));
            Integer.parseInt(ssn.substring(4, 6));
            Integer.parseInt((ssn.substring(7)));
            System.out.println(ssn + " is a valid social security number");
        } catch (NumberFormatException e)
        {
            System.out.println(ssn + " is an invalid social security number");
            System.exit(0);
        }
    }
}
