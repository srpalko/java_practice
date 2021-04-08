package chapter5;

import java.util.Scanner;

/**
 * Displays the number of uppercase letters in a string.
 */
public class CountUppercaseLetters
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();
        int upperCount = 0;
        for (int i = 0; i < entry.length(); i++)
        {
            if (Character.isUpperCase(entry.charAt(i)))
            {
                upperCount++;
            }
        }
        System.out.println("The number of uppercase letters is " + upperCount);
    }
}
