package chapter5;

import java.util.Scanner;

// Rewrite of ISBN check that uses a loop to generate checksum.
public class CheckISBN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNine = input.nextInt();
        int remainingDigits = firstNine;
        int factor = 1;
        int checkSum = 0;

        while (remainingDigits > 0)
        {
            int digit = remainingDigits % 10;
            checkSum += digit * factor;
            remainingDigits /= 10;
            factor++;
        }

        checkSum %= 11;

        System.out.println("The ISBN-10 number is " + firstNine + (checkSum == 10 ? "X": checkSum));
    }
}
