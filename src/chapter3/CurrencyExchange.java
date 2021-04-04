package chapter3;

import java.util.Scanner;

/**
 * Program that converts currency from U.S. dollars to Chinese RMB.
 * User must enter the current exchange rate, conversion type and amount.
 */
public class CurrencyExchange
{
    public static void main(String[] args)
    {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        final double EXCHANGE_RATE = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();
        double amount;
        double convertedAmount;
        if (choice == 0)
        {
            System.out.print("Enter the dollar amount: ");
            amount = input.nextDouble();
            convertedAmount = amount * EXCHANGE_RATE;
            System.out.printf("$%.2f is %.2f yuan", amount, convertedAmount);
        } else if (choice == 1)
        {
            System.out.print("Enter the RMB amount: ");
            amount = input.nextDouble();
            convertedAmount = amount / EXCHANGE_RATE;
            System.out.printf("%.2f yuan is $%.2f", amount, convertedAmount);
        } else
        {
            System.out.println("Incorrect input");
        }



    }
}
