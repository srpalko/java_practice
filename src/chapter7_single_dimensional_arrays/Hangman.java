package chapter7_single_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hangman game that randomly generates a word and prompts the user to guess one letter at a time.
 * Each letter is displayed as an asterisk. When the user makes a correct guess, the actual letter is then displayed.
 * When the user finishes a word, the number of misses are displayed and the user is asked whether to continue
 * to play with another word.
 */
public class Hangman
{
    public static void main(String[] args)
    {
        String[] words = {"happy", "lucky", "guitar", "table", "truck", "fish", "shirt", "tennis", "egg", "maple", 
                "yoga"};
        Scanner input = new Scanner(System.in);

        while (true)
        {
            // get a random word
            String wordToGuess = words[(int) (Math.random() * words.length)];

            // Create an array of asterisks to display
            char[] asterisks = new char[wordToGuess.length()];
            Arrays.fill(asterisks, '*');

            boolean solved = false;
            int misses = 0;
            int lettersRemaining = wordToGuess.length();

            while (!solved)
            {
                String nextDisplay = arrayToString(asterisks);
                System.out.print("(Guess) Enter a letter in word " + nextDisplay + " > ");
                char guess = input.nextLine().charAt(0);
                int checkWord = wordToGuess.indexOf(guess);
                if (checkWord < 0)
                {
                    System.out.println("    " + guess + " is not in the word");
                    misses++;
                }
                else if (checkWord > 0 && asterisks[checkWord] != '*')
                {
                    System.out.println("    " + guess + " is already in the word");
                }
                else
                {
                    asterisks[checkWord] = wordToGuess.charAt(checkWord);
                    lettersRemaining--;
                }
                if (lettersRemaining == 0)
                {
                    solved = true;
                }
            }

            System.out.println(
                    "The word is " + wordToGuess + ". You missed " + misses + " time" + (misses != 1 ? "s" : ""));

            System.out.print("Do you want to guess another word? Enter y or n > ");
            char answer = input.nextLine().charAt(0);
            if (answer == 'n')
            {
                System.exit(0);
            }
        }
    }

    public static String arrayToString(char[] chars)
    {
        StringBuilder s = new StringBuilder();
        for (char item :
                chars)
        {
            s.append(item);
        }
        return s.toString();
    }
}
