package chapter4;

import java.util.Scanner;

/**
 * Checks for valid ISBN-10 code.
 */
public class CheckISBN10
{
    // Get input
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ISBN-10 number: ");
        String isbn = input.nextLine();

        // Check length
        if (isbn.length() != 10)
        {
            System.out.print("Invalid ISBN-10");
            System.exit(0);
        }

        try
        {
            int d1 = Integer.parseInt(isbn.substring(0, 1));
            int d2 = Integer.parseInt(isbn.substring(1, 2));
            int d3 = Integer.parseInt(isbn.substring(2, 3));
            int d4 = Integer.parseInt(isbn.substring(3, 4));
            int d5 = Integer.parseInt(isbn.substring(4, 5));
            int d6 = Integer.parseInt(isbn.substring(5, 6));
            int d7 = Integer.parseInt(isbn.substring(6, 7));
            int d8 = Integer.parseInt(isbn.substring(7, 8));
            int d9 = Integer.parseInt(isbn.substring(8, 9));
            int checksum = isbn.substring(9).equalsIgnoreCase("X")
                    ? 10: Integer.parseInt(isbn.substring(9));

            int checkSumTest = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

            System.out.println(checksum + " " + checkSumTest);

            if (checksum == checkSumTest)
            {
                System.out.println("Valid ISBN-10");
            }
            else
            {
                System.out.println("Invalid ISBN-10");
            }
        } catch (NumberFormatException e)
        {
            System.out.println("Invalid ISBN-10");
            System.exit(0);
        }



    }
}
