package chapter6;

public class PrintATaxTable
{
    public static void main(String[] args)
    {
        System.out.println("Taxable        Single        Married Joint        Married        Head of");
        System.out.println("Income                       or Qualifying        Separate       a House");
        System.out.println("                             Widow(er)                                  ");
        System.out.println("------------------------------------------------------------------------");
        for (int income = 50000; income <= 60000; income += 50)
        {
            long single = Math.round(computeTax(0, income));
            long joint = Math.round(computeTax(1, income));
            long separate = Math.round(computeTax(2, income));
            long head = Math.round(computeTax(3, income));

            System.out.printf("%-7d        %-6d        %-13d        %-8d        %-7d\n", income, single, joint, separate, head);
        }
    }

    /**
     * Computes taxes by calling the appropriate tax method based
     * on the status provided
     * @param status the tax filer's status. 0 = single, 1 = married filing jointly or qualifying widower, 2 = married
     *               filing separately, 3 = head of household. Any other number will cause a return value of -1
     * @param taxableIncome the amount of income to compute taxes for
     * @return amount of tax. -1 if invalid status is given
     */
    public static double computeTax(int status, double taxableIncome)
    {
        // Compute tax
        double tax;

        // Compute tax for single filers
        if (status == 0)
        {
            tax = getTaxSingle(taxableIncome);
        } else if (status == 1)
        {
            tax = getTaxMarriedJointWidower(taxableIncome);

        } else if (status == 2)
        {
            tax = getTaxMarriedSeparate(taxableIncome);
        } else if (status == 3)
        {
            tax = getTaxHeadOfHouse(taxableIncome);
        } else
        {
            return -1;
        }
        return tax;
    }

    public static double getTaxHeadOfHouse(double taxableIncome)
    {
        double tax;
        if (taxableIncome <= 11950)
        {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 45500)
        {
            tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
        } else if (taxableIncome <= 117450)
        {
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (taxableIncome - 45500) * 0.25;
        } else if (taxableIncome <= 190200)
        {
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
        } else if (taxableIncome <= 372950)
        {
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                    (taxableIncome - 190200) * 0.33;
        } else
        {
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                    (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return tax;
    }

    public static double getTaxMarriedSeparate(double taxableIncome)
    {
        double tax;
        if (taxableIncome <= 8350)
        {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 33950)
        {
            tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
        } else if (taxableIncome <= 68525)
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (taxableIncome - 33950) * 0.25;
        } else if (taxableIncome <= 104425)
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
        } else if (taxableIncome <= 186475)
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                    (taxableIncome - 104425) * 0.33;
        } else
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                    (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
        }
        return tax;
    }

    public static double getTaxMarriedJointWidower(double taxableIncome)
    {
        double tax;
        if (taxableIncome <= 16700)
        {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 67900)
        {
            tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
        } else if (taxableIncome <= 137050)
        {
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (taxableIncome - 67900) * 0.25;
        } else if (taxableIncome <= 208850)
        {
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
        } else if (taxableIncome <= 372950)
        {
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                    (taxableIncome - 208850) * 0.33;
        } else
        {
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                    (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return tax;
    }

    public static double getTaxSingle(double taxableIncome)
    {
        double tax;
        if (taxableIncome <= 8350)
        {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 33950)
        {
            tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
        } else if (taxableIncome <= 82250)
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (taxableIncome - 33950) * 0.25;
        } else if (taxableIncome <= 171550)
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
        } else if (taxableIncome <= 372950)
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                    (taxableIncome - 171550) * 0.33;
        } else
        {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                    (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        return tax;
    }
}
