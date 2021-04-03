package chapter3;

import java.util.Scanner;

public class CheckISBN10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNine = input.nextInt();
        int remainingDigits = firstNine;
        int d9 = remainingDigits % 10;
        remainingDigits /= 10;
        int d8 = remainingDigits % 10;
        remainingDigits /= 10;
        int d7 = remainingDigits % 10;
        remainingDigits /= 10;
        int d6 = remainingDigits % 10;
        remainingDigits /= 10;
        int d5 = remainingDigits % 10;
        remainingDigits /= 10;
        int d4 = remainingDigits % 10;
        remainingDigits /= 10;
        int d3 = remainingDigits % 10;
        remainingDigits /= 10;
        int d2 = remainingDigits % 10;
        remainingDigits /= 10;
        int d1 = remainingDigits % 10;

        int checkSum = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("The ISBN-10 number is " + firstNine + (checkSum == 10 ? "X": checkSum));

    }
}
