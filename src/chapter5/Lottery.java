package chapter5;

import java.util.Scanner;

/**
 * Revised lottery that uses loops to ensure two distinct digits.
 */
public class Lottery
{
    public static void main(String[] args)
    {
        // Compute two digits of winning number.
        int digit1 = (int) (Math.random() * 10);
        int digit2;
        // Keep generating digit 2 if it is the same as digit 1.
        do
        {
            digit2 = (int) (Math.random() * 10);
        } while (digit2 == digit1);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two different digits): ");
        int guess = input.nextInt();

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + digit1 + digit2);

        // Check the guess
        if (guess == digit1 * 10 + digit2)
        {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == digit1 && guessDigit1 == digit2)
        {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == digit1 || guessDigit1 == digit2
                || guessDigit2 == digit1 || guessDigit2 == digit2)
        {
            System.out.println("Match one digit: you win $1,000");
        } else
        {
            System.out.println("Sorry, no match");
        }

    }
}
