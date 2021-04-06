package chapter5;

import java.util.Scanner;

/**
 * Takes a loan amount and loan period in years and displays the monthly
 * and total payments for interest rates from 5% to 8% in 1/8th increments.
 */
public class CompareLoans
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        System.out.println();
        for (int rate = 5000; rate <= 8000; rate += 125)
        {
            // Use int to keep loop accurate. Divide by a double to get proper rate
            double annualRate = rate / 100000.0;
            double monthlyInterestRate = rate / 1200000.0;
            double monthlyPayment = amount * monthlyInterestRate /
                    (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%.3f%%           %-15.2f    %.2f\n", annualRate * 100, monthlyPayment, totalPayment);
        }
    }
}
