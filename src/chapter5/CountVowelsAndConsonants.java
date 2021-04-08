package chapter5;

import java.util.Scanner;

/**
 * Takes a string and displays the number of vowels and consonants.
 */
public class CountVowelsAndConsonants
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine().toUpperCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < entry.length(); i++)
        {
            char letter = entry.charAt(i);
            if (Character.isAlphabetic(letter))
            {
                if (letter == 'A' || letter == 'E' || letter == 'I'
                        || letter == 'O' || letter == 'U')
                {
                    vowelCount++;
                } else
                {
                    consonantCount++;
                }
            }
        }

        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consonantCount);
    }
}
