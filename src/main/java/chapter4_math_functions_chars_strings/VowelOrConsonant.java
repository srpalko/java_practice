package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Displays whether the entered letter is a vowel or a consonant.
 * Reads only the first character from the input.
 */
public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);

        // Check for non-alphabet character.
        if (!Character.isLetter(letter))
        {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        }

        // Convert to upper case
        char upperLetter = Character.toUpperCase(letter);

        // Test for vowel
        boolean isVowel = upperLetter == 'A' || upperLetter == 'E' || upperLetter == 'I'
                            || upperLetter == 'O' || upperLetter == 'U';
        if (isVowel)
        {
            System.out.println(letter + " is a vowel");
        } else
        {
            System.out.println(letter + " is a consonant");
        }
    }
}
