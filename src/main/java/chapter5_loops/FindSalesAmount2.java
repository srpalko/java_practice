package chapter5_loops;

import java.util.Scanner;

import static chapter5_loops.FindSalesAmount.commissionAmount;

/**
 * Modification of FindSalesAmount that uses a for loop and
 * allows the user to enter the desired commission.
 */
public class FindSalesAmount2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired commission: ");
        final double COMMISSION_SOUGHT = input.nextDouble();
        final double BASE_SALARY = 5000;
        double commission = 0;
        double decimalSales = 0;
        for (int sales = 1; commission + BASE_SALARY < COMMISSION_SOUGHT; sales++)
        {
            decimalSales = sales / 100.0;
            commission = commissionAmount(decimalSales);
        }

        System.out.printf("The minimum amount of sales to reach $30,000 is $%.2f", decimalSales);
    }
}
