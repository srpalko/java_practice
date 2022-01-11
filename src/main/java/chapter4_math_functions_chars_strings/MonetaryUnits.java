package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Rewrite of exercise from chapter 2.
 * Fixes possible loss of accuracy from converting
 * floats to ints by reading input as string and
 * extracting dollar amount and cents separately.
 */
public class MonetaryUnits
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();
        int decimal = amount.indexOf('.');
        int dollars = Integer.parseInt(amount.substring(0, decimal));
        int cents = Integer.parseInt(amount.substring(decimal + 1));

        int remainingAmount = cents;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount of " + amount + " consists of: ");
        if (dollars > 0)
        {
            System.out.println(dollars + (dollars == 1 ? " dollar": " dollars"));
        }
        if (numberOfQuarters > 0)
        {
            System.out.println(numberOfQuarters + (numberOfQuarters == 1 ? " quarter": " quarters"));
        }
        if (numberOfDimes > 0)
        {
            System.out.println(numberOfDimes + (numberOfDimes == 1 ? " dime": " dimes"));
        }
        if (numberOfNickels > 0)
        {
            System.out.println(numberOfNickels + (numberOfNickels == 1 ? " nickel": " nickels"));
        }
        if (numberOfPennies > 0)
        {
            System.out.println("and " + numberOfPennies + (numberOfPennies == 1 ? " penny": " pennies"));
        }
    }
}
