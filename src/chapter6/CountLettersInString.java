package chapter6;

import java.util.Scanner;

public class CountLettersInString
{
    public static void main(String[] args)
    {
        // Test program
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();
        int count = countLetters(entry);
        System.out.println("There are " + count + " letters in the string.");
    }

    /**
     * Counts the letters in a string
     * @param s String to be tested
     * @return the count of the letters
     */
    public static int countLetters(String s)
    {
        int count = 0;
        for (char character:
                s.toCharArray()
             )
        {
            if (Character.isLetter(character))
            {
                count++;
            }
        }
        return count;
    }
}
