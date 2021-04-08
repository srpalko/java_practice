package chapter6;

public class ComputeCommissions
{
    public static void main(String[] args)
    {
        System.out.println("Sales Amount          Commission");
        System.out.println("--------------------------------");
        for (int amount = 10000; amount <= 100000; amount += 5000)
        {
            double commission = computeCommission(amount);
            System.out.printf("%-12d          %10.2f\n", amount, commission);
        }
    }

    /**
     * Determines commission based on a pre-defined
     * rate table.
     * @param salesAmount dollar amount of a sale
     * @return the dollar amount of the commission
     */
    public static double computeCommission(double salesAmount)
    {
        if (salesAmount <= 5000 && salesAmount > 0)
        {
            return salesAmount * .08;
        } else if (salesAmount <= 10000)
        {
            return (5000 * .08) + ((salesAmount - 5000) * .10);
        } else if (salesAmount > 10000)
        {
            return (5000 * 0.08) + ((10000 - 5000) * 0.10) + ((salesAmount - 10000) * .12);
        }
        else
        {
            return -1;
        }
    }
}
