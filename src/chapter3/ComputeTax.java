package chapter3;

import chapter6.PrintATaxTable;

import java.util.Scanner;

public class ComputeTax
{
    public static void main(String[] args)
    {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print("0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");
        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = 0;

        // Compute tax for single filers
        if (status == 0)
        {
            tax = PrintATaxTable.getTaxSingle(income);
        } else if (status == 1)
        {
            tax = PrintATaxTable.getTaxMarriedJointWidower(income);
        } else if (status == 2)
        {
            tax = PrintATaxTable.getTaxMarriedSeparate(income);
        } else if (status == 3)
        {
            // TODO: 4/1/2021
            tax = PrintATaxTable.getTaxHeadOfHouse(income);
        } else
        {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
