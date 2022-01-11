package chapter5_loops;

import java.util.Scanner;

/**
 * Takes an amount, the annual percentage yield, and the number of months
 * and displays a table of CD values per month.
 */
public class ComputeCDValue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual percentage yield: ");
        double yield = input.nextDouble();
        System.out.print("Enter the maturity period (number of months): ");
        int months = input.nextInt();
        double balance = 10000;
        System.out.println("Month    CD Value");
        for (int month = 1; month <= months; month++)
        {
            balance = balance + balance * yield / 1200;
            System.out.printf("%-5d    $%.2f\n", month, balance);
        }
    }
}
