package chapter8_multidimensional_arrays;

import java.util.Scanner;

/**
 * Rewrite of listing 3.5 using arrays. For each filing status, there are six tax rates. Each rate is applied to a
 * certain amount of taxable income. For example, from the taxable income of $400,000 for a single filer, $8,350 is
 * taxed at 10%, (33,950 - 8,350) at 15%, (82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250)
 * at 33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing statuses.
 */
public class ComputeTax
{
    public static void main(String[] args)
    {
        // array to represent the rates for all filing statuses
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // array to represent the tax brackets for each status
        int[][] brackets =
                {
                        {8350, 33950, 82250, 171550, 372950}, // Single filer
                        {16700, 67900, 137050, 208850, 372950}, // Married jointly/qualifying widow(er)
                        {8350, 33950, 68525, 104425, 186475}, // Married filing separately
                        {11950, 45500, 117450, 190200, 372950} // Head of household
                };

        // get input
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, " +
                         "3-head of household) Enter the filing status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();


    }

    public static double computeTax(int status, double income, double[] rates, int[][] brackets)
    {
        return brackets[status][0] * rates[0] +
               (brackets[status][1] - brackets[status][0]) * rates[1] +
               (brackets[status][2] - brackets[status][1]) * rates[2] +
               (brackets[status][3] - brackets[status][2]) * rates[3] +
               (brackets[status][4] - brackets[status][3]) * rates[4] +
               (income - brackets[status][4]) * rates[5];
    }

}
