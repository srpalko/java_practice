package chapter6;

import java.util.Scanner;

public class ComputeFutureInvestmentValue
{
    public static void main(String[] args)
    {
        // Get input and convert interest rate to monthly rate
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double monthlyRate = input.nextDouble() / 1200;

        // Display a table of future values
        System.out.println("Years     Future Value");
        for (int years = 1; years <= 30; years++)
        {
            System.out.printf("%-5d     %12.2f\n", years, futureInvestmentValue(amount, monthlyRate, years));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
    {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
