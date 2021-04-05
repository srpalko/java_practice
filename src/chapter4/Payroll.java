package chapter4;

import java.util.Scanner;

/**
 * Takes input and prints a payroll statement.
 * Input:
 * Employee's name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 0.20)
 * State tax withholding rate (e.g., 0.09)
 */
public class Payroll
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter the federal tax withholding rate: ");
        double federalRate = input.nextDouble();
        System.out.print("Enter the state tax withholding rate: ");
        double stateRate = input.nextDouble();

        // Calculations
        double grossPay = hours * payRate;
        double fedWithholding = grossPay * federalRate;
        double stateWithholding = grossPay * stateRate;
        double totalDeduction = fedWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        // Display
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalRate * 100, fedWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateRate * 100, stateWithholding);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f", netPay);
    }
}
