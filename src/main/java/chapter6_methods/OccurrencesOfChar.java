package chapter6_methods;

import java.util.Scanner;

public class OccurrencesOfChar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();
        System.out.print("Enter a character to count: ");
        char character = input.nextLine().charAt(0);
        int count = count(entry, character);
        System.out.println("The character " + character + " appears " + count + " times.");
    }

    /**
     * Counts the occurrences of the specifies character
     * in a string.
     * @param str The string to test
     * @param a The char to count
     * @return The number of occurrences
     */
    public static int count(String str, char a)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == a)
            {
                count++;
            }
        }
        return count;
    }
}
