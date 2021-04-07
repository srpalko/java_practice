package chapter5;

/**
 * Finds the minimum sales that a salesperson needs
 * to generate to make $30,000.
 */
public class FindSalesAmount
{
    public static void main(String[] args)
    {
        final double BASE_SALARY = 5000;
        double sales = 0;
        double commission;
        do
        {
            sales += 0.01;
            commission = commissionAmount(sales);

        } while (commission + BASE_SALARY < 30000);

        System.out.printf("The minimum amount of sales to reach $30,000 is $%.2f", sales);
    }

    public static double commissionAmount(double sale)
    {
        if (sale <= 5000)
        {
            return sale * .08;
        } else if (sale <= 10000)
        {
            return (5000 * .08) + ((sale - 5000) * .10);
        } else if (sale > 10000)
        {
            return (5000 * 0.08) + ((10000 - 5000) * 0.10) + ((sale - 10000) * .12);
        }
        else
        {
            return -1;
        }
    }
}
