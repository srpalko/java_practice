package chapter6;

import java.util.Scanner;

/**
 * Takes a string representing a phone number and converts
 * any alphabetic characters to the correct number on a
 * phone keypad.
 */
public class PhoneKeypads
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String phoneNumber = input.nextLine();
        StringBuilder newNumber = new StringBuilder();

        for (int i = 0; i < phoneNumber.length(); i++)
        {
            if (Character.isLetter(phoneNumber.charAt(i)))
            {
                newNumber.append(getNumber(phoneNumber.charAt(i)));
            } else
            {
                newNumber.append(phoneNumber.charAt(i));
            }
        }
        System.out.println(newNumber);
    }


    /**
     * Returns the corresponding number on a phone keypad
     * for the inputted letter
     * @param letter letter to be converted
     * @return keypad number
     */
    public static int getNumber(char letter)
    {
        letter = Character.toUpperCase(letter);

        int number;

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
            number = -1;
        }
        return number;
    }
}
