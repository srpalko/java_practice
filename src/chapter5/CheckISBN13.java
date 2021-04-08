package chapter5;

import java.util.Scanner;

/**
 * Calculates the checksum of an ISBN-13 number based on the
 * first 12 digits.
 */
public class CheckISBN13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();
        if (isbn.length() != 12)
        {
            System.out.println(isbn + " is an invalid input");
            System.exit(1);
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 12; i++)
        {
            int digit = Integer.parseInt(String.valueOf(isbn.charAt(i)));
            count++;
            if (count % 2 != 0)
            {
                sum += digit;
            } else
            {
                sum += digit * 3;
            }
        }
        int checksum = 10 - (sum % 10);
        isbn = checksum == 10 ? isbn + "0" : isbn + checksum;
        System.out.println("The ISBN-13 number is " + isbn);
    }
}
