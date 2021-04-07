package chapter5;

import java.util.Scanner;

/**
 * Takes a loan amount, number of years and interest rate and
 * displays the amortization schedule for the loan.
 */
public class LoanAmortizationSchedule
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble() / 100;
        double monthlyInterestRate = rate / 12;
        int payments = years * 12;
        double monthlyPayment = amount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        // Print loan info
        System.out.println();
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment);

        // Print amortization schedule
        System.out.println("Payment#     Interest     Principal     Balance");
        for (int i = 1; i <= payments; i++)
        {
            double monthlyInterest = monthlyInterestRate * amount;
            double principal = monthlyPayment - monthlyInterest;
            amount -= principal;
            // Accounts for extra money left at last payment
            if (i == payments && amount > 0)
            {
                principal += amount;
            }

            System.out.printf("%-8d     %-8.2f     %-9.2f      %.2f\n", i, monthlyInterest, principal, amount);
        }
    }
}
