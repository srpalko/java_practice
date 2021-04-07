package chapter5;

import java.util.Scanner;

/**
 * Take an amount, annual interest rate, and number of months
 * and display the amount in the savings account after the
 * given month.
 */
public class CompoundValue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter an annual interest rate: ");
        double interestRate = input.nextDouble() / 100;
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();
        double monthlyInterestRate = interestRate / 12;
        double balance = 0;
        for (int month = 1; month <= months; month++)
        {
            balance = (amount + balance) * (1 + monthlyInterestRate);
        }
        System.out.printf("After %d months, the balance is $%.2f", months, balance);
    }
}
