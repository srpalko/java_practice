package chapter4;

import java.util.Scanner;

/**
 * Takes a letter and displays its corresponding international
 * standard letter/number telephone mapping.
 */
public class PhoneKeyPads
{
    public static void main(String[] args)
    {
        // Get input and convert to upper case
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);
        letter = Character.toUpperCase(letter);

        int number = -1; // -1 indicates error

        if (letter >= 'A' && letter <= 'C')
        {
            number = 2;
        } else if (letter >= 'D' && letter <= 'F')
        {
            number = 3;
        } else if (letter >= 'G' && letter <= 'I')
        {
            number = 4;
        } else if (letter >= 'J' && letter <= 'L')
        {
            number = 5;
        } else if (letter >= 'M' && letter <= 'O')
        {
            number = 6;
        } else if (letter >= 'P' && letter <= 'S')
        {
            number = 7;
        } else if (letter >= 'T' && letter <= 'V')
        {
            number = 8;
        } else if (letter >= 'W' && letter <= 'Z')
        {
            number = 9;
        } else
        {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }

        System.out.println("The corresponding number is " + number);
    }
}
