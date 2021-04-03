package chapter3;

import java.util.Scanner;

public class MonetaryUnits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

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

        System.out.printf("Your amount %.2f consists of\n", amount);
        if (numberOfOneDollars > 0)
        {
            System.out.println(numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar": " dollars"));
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
