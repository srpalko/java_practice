package chapter4;

import java.util.Scanner;

/**
 * Takes a String and displays the length and the first character.
 */
public class ProcessString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();
        int length = entry.length();
        char firstChar = entry.charAt(0);

        System.out.println("This string has length " + length +
                " and the first character is " + firstChar);
    }
}
